package ExercisesDay4;
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfLines = input.nextInt();
        if (numOfLines > 0) {
            String line = "";
            for (int i = 1; i < numOfLines; i++) {
                line += " ";
            }
            line += "*";
            System.out.println(line);
            for (int i = 1; i < numOfLines / 2; i++) {
                line += "**";
                line = line.startsWith(" ") ? line.substring(1) : line;
                System.out.println(line);
            }
            if (numOfLines % 2 == 1 && numOfLines > 1) {
                line += "**";
                line = line.startsWith(" ") ? line.substring(1) : line;

            }
        } else {
            for (int i = numOfLines / 2+1; i < numOfLines; i++){
//                line = " " + line;

            }}}}