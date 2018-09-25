public class TodoPrint {

    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention
    // Expected output:
    // My todo:
    //  - Buy milk
    //  - Download games
    //  - Diablo
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        todoText = "My ToDo:\n" + todoText;

        todoText += " - Download games\n";

        todoText += "\t - Diablo";

        System.out.println(todoText);
    }
}
