package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"));

        List<String> strings = Files.readAllLines(Path.of("input.txt"));

        String table = "aeiou";
        String tableVowels = "!?.,";
        int vowels = 0;
        int punctuation = 0;
        int othrs = 0;
        for (String string : strings) {
            for (int i = 0; i < string.length(); i++) {
                char ch = string.charAt(i);
                if (table.contains(ch + "")) {
                    vowels++;
                } else if (tableVowels.contains(ch + "")) {
                    punctuation++;
                } else {
                    if (ch != 32) {
                        othrs++;
                    }
                }
            }
            System.out.println(string);
        }
        
        PrintWriter writer = new PrintWriter("output.txt");

        writer.println("Vowels: " + vowels);
        writer.println("Consonants: " + othrs);
        writer.println("Punctuation: " +punctuation);
        writer.close();

    }
}
