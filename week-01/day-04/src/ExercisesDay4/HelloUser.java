package ExercisesDay4;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell me tu nombre, Por Favor:");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
