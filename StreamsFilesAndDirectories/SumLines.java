package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SumLines {
    public static void main(String[] args) {

        String path = "C:\\Users\\isk\\IdeaProjects\\Stack and Queues\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line =reader.readLine();
            while (line != null){
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                line = reader.readLine();
                System.out.println(sum);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

