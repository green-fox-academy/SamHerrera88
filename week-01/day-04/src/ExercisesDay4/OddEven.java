package ExercisesDay4;
import java.util.Scanner;

public class OddEven {
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please give me a number: ");
        String intInStr = scanner.nextLine();
        int i = Integer.parseInt(intInStr);
            if (i % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");

        }
    }
}
