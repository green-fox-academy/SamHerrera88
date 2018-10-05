public class Strings {
    // Given a string, compute recursively (no loops) a new string where all the
    // lowercase 'x' chars have been changed to 'y' chars.

    public static void main(String[] args) {
        String name = "Whx So Serious?";
        System.out.println(changeXWitY(name));
    }

    public static String changeXWitY(String name) {
        if (!name.contains("x")) {
            return name;
        } else {
            return changeXWitY(name.replaceFirst("x", "y"));
        }
    }
}