import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.

    public static void main(String[] args) {
        try {

            Path filePath = Paths.get("Testing.txt");
            List<String> words = Files.readAllLines(filePath);

            System.out.println(words.size());
        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}


