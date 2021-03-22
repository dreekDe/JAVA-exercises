package StreamsFilesAndDirectories;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {

        // BufferedReader readerFromConsole  = new BufferedReader(new InputStreamReader(System.in)); // 4etene ot konzolata


        BufferedReader reader = new BufferedReader(new FileReader(".idea/input.txt")); // 4etene ot fail

        // String read = reader.readLine();

        Stream<String> lines = reader.lines();
        List<String> collect = lines.collect(Collectors.toList());

        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        for (int i = 0; i < collect.size(); i++) {
            if ((i + 1) % 3 == 0) {
                writer.write(collect.get(i));
                writer.newLine();
            }
        }
        writer.close();
    }
}
