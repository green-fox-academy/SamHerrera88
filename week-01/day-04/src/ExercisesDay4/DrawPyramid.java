package ExercisesDay4;
import java.util.Scanner;
public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //    *
    //   ***
    //  *****
    // *******
    // The pyramid should have as many lines as the number was
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfLines = input.nextInt();
        if (numOfLines > 0) {
            //First Line
            String line = " ";
            for (int i = 1; i < numOfLines; i++) {
                line += " ";
            }
            line += "*";
            System.out.println(line);
            for (int i = 1; i < numOfLines; i++) {
                line += "**";
                line = line.startsWith(" ") ? line.substring(1) : line;
                System.out.println(line);
            }
        } else {
            System.out.println("Please give me s number higher than 0");
        }
    }
}
