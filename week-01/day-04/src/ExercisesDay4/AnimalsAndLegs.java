package ExercisesDay4;
import java.util.Scanner;

    public class AnimalsAndLegs {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tell me how many chickens you have?");
                String chickenStr = scanner.nextLine();
                    double chickenNum = Double.parseDouble(chickenStr);
            System.out.println("Tell me how many pigs you have?");
                String pigsStr = scanner.nextLine();
                    double pigsNum = Double.parseDouble(pigsStr);
            System.out.println("There are up to " + (Math.round(chickenNum * 2) + Math.round(pigsNum *4)) + " legs in your farm.");



    }
}
