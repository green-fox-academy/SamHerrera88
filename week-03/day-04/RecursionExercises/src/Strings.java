public class Strings {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {
        System.out.println(changeXWitY("Whx So Serious?"));
    }

    public static String changeXWitY(String word) {
        String helper = "";
        if (word.length() == 0) {
            return "";
        } else {
            char lastChar = word.charAt(word.length() - 1);
            if (lastChar == 'x') {
                return changeXWitY(word.substring(0, word.length() - 1)) + "y";
            } else {
                return changeXWitY(word.substring(0, word.length() - 1)) + lastChar;
            }
        }
    }
}