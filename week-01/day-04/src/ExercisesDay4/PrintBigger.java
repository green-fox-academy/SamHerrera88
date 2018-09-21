package ExercisesDay4;
import java.util.Scanner;

public class PrintBigger {
    // Write a program that asks for two numbers and prints the bigger one
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me two numbers, one at a time, and I'll print you the biggest one: ");
        String num1InStr = scanner.nextLine();
        String num2InStr = scanner.nextLine();
        double num1 = Double.parseDouble(num1InStr);
        double num2 = Double.parseDouble(num2InStr);
        System.out.println("Here the biggest one: " );
            if (num1 > num2) {
                System.out.println(num1);
            } else {
                System.out.println(num2);
        }

    }
}
