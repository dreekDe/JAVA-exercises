package StreamsFilesAndDirectories;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String inWords = "words.txt";
        String outText = "text.txt";

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        List<String> strings = Files.readAllLines(Path.of(inWords));
        for (String string : strings) {
            Arrays.stream(string.split("\\s+"))
                    .forEach(en -> words.put(en, 0));

        }
        for (String string : Files.readAllLines(Path.of(outText))) {
            Arrays.stream(string.split("\\s+"))
                    .forEach(e -> {
                        if (words.containsKey(e)) {
                            words.put(e, words.get(e) + 1);
                        }
                    });

        }
        PrintWriter writer = new PrintWriter("outputFile.txt");

        for (Map.Entry<String, Integer> e : words.entrySet()) {
            writer.println(e.getKey() + " - " + e.getValue());
        }
        writer.close();
    }
}
