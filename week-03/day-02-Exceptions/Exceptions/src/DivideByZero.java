import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and it will be divided by 10: ");
        int divisor = scanner.nextInt();

        try {
            int result = 10 / divisor;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero!");
        }

    }
}
