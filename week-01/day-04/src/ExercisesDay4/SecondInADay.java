package ExercisesDay4;

public class SecondInADay {
    //    int currentHours = 14;
    //    int currentMinutes = 34;
    //    int currentSeconds = 42;
    //
    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int secondsLeft = 24 * 60 * 60 - currentHours * 60 * 60 - currentMinutes * 60 - currentSeconds;
        System.out.println(secondsLeft);
    }
}