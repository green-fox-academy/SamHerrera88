package ExercisesDay4;
import java.util.Scanner;

public class FindTheSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input two strings, I'll tell you the index of the second one in the first:");

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(subStr(str1, str2));
    }


    public static int subStr(String input, String q) {
        return input.indexOf(q);
    }
}