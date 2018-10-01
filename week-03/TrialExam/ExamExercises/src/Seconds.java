import java.util.ArrayList;

public class Seconds {

    public static void main(String[] args) {
        // Create a function that takes a list as a parameter,
        // and returns a new list with every second element from the orignal list
        // example: [1, 2, 3, 4, 5] should produce [2, 4] - print this result

        System.out.println("Every other number on the the list: ");
        int[] originalList = {1, 2, 3, 4, 5};
        for (int i = 1; i < originalList.length; i += 2) {
            System.out.println(originalList[i]);
        }

    }
}
