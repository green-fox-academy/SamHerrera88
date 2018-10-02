import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountAs {

    // Create a function that takes a string parameter,
    // counts the occurrences of the letter "a", and returns it as a number.

    // example: on the input "Apple" the function should return 1 - print this result
    // example: on the input "Avocado" the function should return 2 - print this result
    // example: on the input "Blueberry" the function should return 0 - print this result

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int countTheAs[] = {256};
        System.out.println("Please enter any word and I'll count how many A's are in it: ");

    }

    HashMap<Character, Integer> map = new HashMap<>();

    {
        for (char character : input.toCharArray())
            if (map.containsKey(character)) {
                count = map.get(character);
                map.put(character, count + 1);
            } else {
                map.put(character, 1);
            }
    }
        for(
    Map.Entry<Character, Integer> entry :map.entrySet())

    {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    {

//    int charCount = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//
//            if (input.charAt(i) == 'a') {
//                charCount++;
    }
}

