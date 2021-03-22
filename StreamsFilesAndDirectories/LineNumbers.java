package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static int count = 1;
    public static void main(String[] args) throws IOException {

        String inPath = "input.txt";
        String outPath = "output.txt";

//        List<String> strings = Files.readAllLines(Path.of(inPath));
//
//
        PrintWriter writer = new PrintWriter(outPath);

//        for (String string : strings) {
//            writer.println(count++ + "." + " " + string);
//        }

        Files.readAllLines(Path.of(inPath)).forEach(string -> writer.println(count++ + ". " + string));
        writer.close();


    }
}
