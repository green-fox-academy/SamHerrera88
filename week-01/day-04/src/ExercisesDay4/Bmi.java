package ExercisesDay4;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        double massInKg = 81.2;
        double heightInM = 1.78;
        double bmi = (massInKg)/(heightInM);
        System.out.println("Your BMI is: "+bmi);
        printBMICategory(bmi);}
        // Prints BMI category
    private static void printBMICategory(double bmi) {
        if(bmi < 18.5) {
            System.out.println("You are underweight");
        }else if (bmi < 25) {
            System.out.println("You are normal");
        }else if (bmi < 30) {
            System.out.println("You are overweight");
        }else {
            System.out.println("You are obese");
        }
    }
}
