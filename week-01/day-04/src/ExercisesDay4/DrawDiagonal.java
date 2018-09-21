package ExercisesDay4;
import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sidelength = input.nextInt();
        if (sidelength > 0) {
            for (int i = 1;i <= sidelength; i++){
                String drawing = "";
                if (i ==1 || i == sidelength){
                    for (int j = 0; j < sidelength; j++){
                        drawing += "%";
                    }
                    System.out.println(drawing);
                } else {
                    for (int j = 1; j <= sidelength; j++){
                        if (j == 1 || j == sidelength || i == j){
                            drawing += "";
                        }
                     }
                    System.out.println(drawing);
                }
            }
        } else {
            System.out.println("Please give me a number greater than 0:");
        }
    }
}
