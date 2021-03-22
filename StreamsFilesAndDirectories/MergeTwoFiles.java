package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String inputOne = "C:\\Users\\isk\\IdeaProjects\\Stack and Queues\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String inputTwo = "C:\\Users\\isk\\IdeaProjects\\Stack and Queues\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        String output = "output.txt";

        PrintWriter writer = new PrintWriter(output);
        Files.readAllLines(Path.of(inputOne)).forEach(writer::println);

        Files.readAllLines(Path.of(inputTwo)).forEach(writer::println);

        writer.close();


    }
}
