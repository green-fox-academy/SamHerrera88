package ExercisesDay4;

public class Cubiod {
    public static void main(String[] args) {
        double height = 5;
        double width = 10;
        double length = 20;
        double surfaceArea = 2 * height * width + 2 * height * length + 2 * width * length;
        double volume = height * width * length;
        System.out.println("Surface Area: " + Math.round(surfaceArea) + "\nVolume: " + Math.round(volume));
    }
}
