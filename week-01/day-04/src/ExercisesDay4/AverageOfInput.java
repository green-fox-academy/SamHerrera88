package ExercisesDay4;
import java.util.Scanner;

public class AverageOfInput {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me 5 numbers and I will find the sum and average of them? ");
        for (int i = 0; i < 5; i++) {
            String numInStr = scanner.nextLine();
            int num = Integer.parseInt(numInStr);
            sum += num;
        avg = sum/ 5.0;
            System.out.println("The Sum is : " + sum + " and the Average " + avg);

        }
        }
    }

