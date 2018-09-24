import java.util.Scanner;

public class factorial {
    //  Create the usual class wrapper
    //  and main method on your own.
    // - Create a function called `factorio`
    //   that returns it's input's factorial

    public static void main(String[] args) {

        int num = 5;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}