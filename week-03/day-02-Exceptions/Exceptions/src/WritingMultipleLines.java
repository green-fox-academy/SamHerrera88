// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class WritingMultipleLines {

    public static void main(String[] args) {
        writeToFile("path", "word", Integer.parseInt("num"));
        Scanner scanner = new Scanner(System.in);
        String path = scanner.toString();
        System.out.println("What file would you like to write in?");

        Scanner input2 = new Scanner(System.in);
        String word = scanner.toString();
        System.out.println("What would you like write in it?");

        Scanner input3 = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("How many time do you want it written?");
    }

    public static void writeToFile(String path, String word, int numOfLines) {
        Path path1 = Paths.get("Testing.txt");
        ArrayList<String> toWrite = new ArrayList<>();
        for (int i = 0; i < numOfLines; i++) {
            toWrite.add(toWrite.size(), word);
        }
        try {
            writeToFile("", "", Integer.parseInt("num"));
            {
            }
        } catch
