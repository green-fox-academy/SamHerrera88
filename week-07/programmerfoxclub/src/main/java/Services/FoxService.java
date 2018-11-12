package Services;

import FoxTamagotchi.Model.Drink;
import FoxTamagotchi.Model.Food;
import FoxTamagotchi.Model.Fox;

import java.util.List;

public interface FoxService {
    Boolean isExist(String foxname);

    Fox login(String foxname);

    Fox findOne(String name);

    List<Food> getFoodValues();

    List<Drink> getDrinkValues();
}
