package ExercisesDay4;
import java.util.Scanner;

public class MultipicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me a number and I'll show you its multiplication table up to 10. ");
        int num = input.nextInt();
        for (int i = 1; i < 11; i++){
            System.out.println(i + " * " + num + " = " + i*num);
        }
    }
}
