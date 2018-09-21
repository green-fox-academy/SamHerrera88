package ExercisesDay4;
import java.util.Scanner;


public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("So I'm thinking of a number from 1 to 100, try to guess it.");
        int guess = scanner.nextInt();
        while (7 != guess){
            if (7 > guess){
                System.out.println("The number you guessed is low, guess again.");
                guess = scanner.nextInt();
            } else {
                System.out.println("The number you guessed is high, guess again.");
                guess = scanner.nextInt();
            }
        }
        System.out.println("You guessed my number: " + 7);
    }
}
