import java.util.Arrays;
import java.util.List;

public class AppendA {

    // Create a method called "appendA()" that adds "a" to every string in the "far" list.
    // The parameter should be a list.
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));
    }

}
