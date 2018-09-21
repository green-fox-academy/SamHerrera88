package ExercisesDay4;
import java.util.Scanner;
    public class MileToKm {
    // Write a program that asks for an integer that is a distance in kilometers,
    // then it converts that value to miles and prints it.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Please, give me a distance in kilometers, and I'll covert it for you in miles:");
        String kiloStr = scanner.nextLine();
            double km = Double.parseDouble(kiloStr);
                 System.out.println(km/1.609344);
    }
}
