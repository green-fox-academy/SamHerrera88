public class StringsToo {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.
    public static void main(String[] args) {
        String name = "PracticingxisxCRUCIALxtoxsucceeding.xxSoxletsxgetxit!";
        System.out.println(removeXs(name));
    }

    public static String removeXs(String name) {
        if (!name.contains("x")) {
            return name;
        } else {
            return removeXs(name.replaceFirst("x", " "));
        }
    }
}
