package ExercisesDay4;

public class swap {
    public static void main(String[] args) {
        // swap the values of the variables
        int a = 123;
        int b = 526;

        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("a is " + a + " and b is " + b);
    }
}
