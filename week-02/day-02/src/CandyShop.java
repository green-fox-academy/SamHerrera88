import java.util.ArrayList;

public class CandyShop {

    // Accidentally we added "2" and "false" to the list.
    // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
    // No, don't just remove the lines
    // Create a method called sweets() which takes the list as a parameter.

    public static void main(String... args) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets(arrayList));
    }

    public static Object sweets(ArrayList sweet) {
        if (sweet.contains(false)) {
            sweet.set(sweet.indexOf(false), "Ice Cream");
        } else {
        }
        if (sweet.contains(2)) {
            sweet.set(sweet.indexOf(2), "Croissant");
        } else {
        }
        return sweet;
    }
}
