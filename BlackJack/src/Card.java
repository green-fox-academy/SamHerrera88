public class Card {
    String suit;
    String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    @Override
    public String toString(){
        return value + " " + suit;
    }
}
