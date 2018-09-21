package ExercisesDay4;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PartyIndicator {
    // Write a program that asks for two numbers
    // The first number represents the number of girls that comes to a party, the
    // second the boys
    // It should print: The party is excellent!
    // If the the number of girls and boys are equal and 20 or more people are coming to the party
    // It should print: Quite cool party!
    // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
    // It should print: Average party...
    // If there are less people coming than 20
    // It should print: Sausage party
    // If no girls are coming, regardless the count of the people
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("So, I heard from a little birdie that there's a party. How many guys are coming?");
        int numOfBoys = scanner.nextInt();
        System.out.println("Ok, but how many girl are going?" );
        int numOfGirls = scanner.nextInt();
        System.out.println("Here's the type of party you are going to have: ");
        if (numOfGirls == 0 && numOfBoys > 0) {
            System.out.println("SausageFest");
        } else if ((numOfBoys + numOfGirls) > 20 ) {
            if (numOfBoys == numOfGirls ) {
                System.out.println("The party is EPIC!");
            } else {
                System.out.println("Pretty cool party.");
            }
        } else if ((numOfBoys + numOfGirls) > 0 ) {
            System.out.println("This party is ok.");
        }
            }
        }
