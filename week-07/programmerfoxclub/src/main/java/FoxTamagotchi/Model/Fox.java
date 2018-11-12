package FoxTamagotchi.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

    private String name;
    private String food;
    private String drink;
    private List<Trick> listOfLearnedTricks = new ArrayList<Trick>();
    private List<Trick> listOfAvailableTricks;

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        this.food = "vegan cookies";
        this.drink = "soda";
//        initializeListOfTricks();
    }

//    private void initializeListOfTricks() {
//        listOfAvailableTricks = new ArrayList<>();
//        for (Trick trick : Trick.value()) {
//            listOfAvailableTricks.add(trick);
//        }
//    }

    public String getName() {
        return name;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public List<Trick> getListOfLearnedTricks() {
        return listOfLearnedTricks;
    }

    public List<Trick> getListOfAvailableTricks() {
        return listOfAvailableTricks;
    }
    public void addNewTrick(Trick newtrick){
        listOfLearnedTricks.add(newtrick);
        listOfAvailableTricks.remove(newtrick);
    }
}
