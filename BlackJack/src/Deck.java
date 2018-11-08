import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    List<Card> cards = new ArrayList<>();
    int clubCount;
    int heartCount;
    int spadeCount;
    int diamondCount;

    public Deck(int quantity) {
        for (int i = 0; i <quantity ; i++) {
            String value = "";
            String suit = "";
            if (i % 4 == 0) {
                suit = "Club";
                clubCount++;
            } else if (i % 4 == 1) {
                suit = "Diamond";
                diamondCount++;
            } else if (i % 4 == 2) {
                suit = "Heart";
                heartCount++;
            } else {
                suit = "Spade";
                spadeCount++;
            }
            if (i % 13 == 0) {
                value = "2";
            } else if (i % 13 == 1) {
                value = "3";
            } else if (i % 13 == 2) {
                value = "4";
            } else if (i % 13 == 3) {
                value = "5";
            } else if (i % 13 == 4) {
                value = "6";
            } else if (i % 13 == 5) {
                value = "7";
            } else if (i % 13 == 6){
                value = "8";
            } else if (i % 13 == 7){
                value = "9";
            } else if (i % 13 == 8){
                value = "10";
            } else if (i % 13 == 9){
                value = "Jack";
            } else if (i % 13 == 10){
                value = "Queen";
            } else if(i % 13 == 11) {
                value = "King";
            } else {
                value = "Ace";
            }
               cards.add(new Card(suit, value));
        }

    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public Card draw(){
        Card cardDrawn = cards.get(cards.size()-1);
        cards.remove(cardDrawn);
        if(cardDrawn.suit.equals("Club"))
            clubCount--;
        else if (cardDrawn.suit.equals("Hearts"))
            heartCount--;
        else if (cardDrawn.suit.equals("Spades"))
            spadeCount--;
        else
            diamondCount--;
        return cardDrawn;
    }
    @Override
    public String toString(){
        return cards.size() + " cards  - " + clubCount + " Clubs, " + diamondCount + " Diamonds, " + heartCount + " Hearts, " + spadeCount + " Spades";
    }
}
