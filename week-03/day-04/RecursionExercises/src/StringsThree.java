import javafx.scene.control.Separator;

public class StringsThree {
    // Given a string, compute recursively a new string where all the
    // adjacent chars are now separated by a "*".
    public static void main(String[] args) {
        String name = "YYaaaaaaaaaaaaaBbooooooooiiiiiiiiiii!!!!";
        System.out.println(Separator(name));
    }

    private static String Separator(String name) {
        int wordsWithStars = name.length() - 1;
        if (name.length() == wordsWithStars) {
            return name;
        }
        int i = 1;
        return Separator(name.substring(i));
    }
}