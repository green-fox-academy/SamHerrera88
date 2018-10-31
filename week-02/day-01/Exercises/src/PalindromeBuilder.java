import java.util.ArrayList;

public class PalindromeBuilder {
    //    Create a function named create palindrome following your current language's style guide. It should take a string,
    //    create a palindrome from it and then return it.
    //    Examples
    //    input	           output
    //    ""	             ""
    //    "greenfox"	"greenfoxxofneerg"
    //    "123"	           "123321"
    public static void main(String[] args) {
    String pali = "Jonathan";
        System.out.println();
        palindrome(pali);
    }

    public static void palindrome(String input){
        String[] toTurn;
        toTurn = input.split("");
        String reflect = "";
        ArrayList<String> returned = new ArrayList<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            returned.add(toTurn[i]);
        }
        for (int i = 0; i < returned.size() ; i++) {
            reflect += returned.get(i);
        }
        System.out.println(input+reflect);
    }
}
