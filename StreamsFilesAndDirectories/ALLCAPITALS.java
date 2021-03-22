package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {


        String path = "input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(path));

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt")));

       Files.readAllLines(Path.of(path)).forEach(str-> {
           try {
               writer.write(str.toUpperCase());
               writer.newLine();
           } catch (IOException e) {
               e.printStackTrace();
           }
       });
       writer.close();


    }

}