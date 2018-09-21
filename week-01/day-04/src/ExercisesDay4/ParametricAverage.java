package ExercisesDay4;
import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'll calculate the total and average of how many numbers you'd like. How many will there be?");
        int qty = scanner.nextInt();
        if (qty <= 0){
            System.out.println("Ok, whatever.");
        } else {
            System.out.println("Great, Let me get those digits!");
            int sum = 0;
            double avg = 0;
            for ( int i = 1; i <= qty;i++){
                int num = scanner.nextInt();
                sum += num;
            }
            double qtyDouble = qty;
            double average = sum/qtyDouble;
            System.out.println("Sum: " + sum + ", Average:" + average);
        }
    }
}
