import java.util.ArrayList;
import java.util.Objects;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "Astro";
        String string2 = "Rotas";

        anagram(string1, string2);
    }

    public static boolean anagram(String string1, String string2) {
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < string1.length(); i++) {
            list.add(string1.charAt(i));
        }
        for (int j = 0; j < string2.length(); j++) {
            list2.add(string2.charAt(j));

//            list.sort(Objects::checkIndex);
//            list2.sort(Objects::checkIndex);

            if (list.containsAll(list2)) {
                System.out.println("Anagram");
            } else
                System.out.println("not Anagram");
        }
        if (list.equals(list2)) {
            return true;
        } else {
            return false;
        }
    }
}


