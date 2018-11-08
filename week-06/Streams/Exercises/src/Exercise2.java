import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;

public class Exercise2 {
    //Write a Stream Expression to get the average value of the odd numbers from the following array:

    public static void main(String[] args) {
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));

        OptionalDouble average = numbers2.stream().
                filter(p -> p %2 != 0).
                mapToDouble(p -> p).
                average();
        System.out.println(average.getAsDouble());
        System.out.println();
    }
}
