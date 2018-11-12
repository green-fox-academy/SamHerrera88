package FoxTamagotchi.Repository;

import FoxTamagotchi.Model.Drink;
import FoxTamagotchi.Model.Food;
import FoxTamagotchi.Model.Fox;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoxRepo {
    List<Fox> foxes = new ArrayList<>();

    private List<Food> foodValues = Arrays.asList(Food.values());
    private List<Drink> drinkValues = Arrays.asList(Drink.values());

    public FoxRepo(){

    }
    public Boolean isExist(String name){
        for (Fox fox: foxes) {
            if(fox.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
