import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ElementFinder {

    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!

    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println(containsSeven(arrayList));
    }

    public static String containsSeven(ArrayList check) {
        String checkList = "";
        ArrayList<String> numList = new ArrayList<>(Arrays.asList("Hoooooray", "Nooooooo"));
        if (check.contains(7)) {
            checkList = numList.get(0);
        } else {
            checkList = numList.get(1);
        }
        return checkList;
    }
}
