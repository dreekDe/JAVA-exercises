package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {


        String path = "I:\\input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        String table = ",.!?";

        FileOutputStream outputStream = new FileOutputStream("I:\\output.txt");

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
             char ch = line.charAt(i);
                if (!table.contains(String.valueOf(ch))){// ch kato string
                    outputStream.write(ch);
                }
            }
            outputStream.write('\n');

        }

    }
}
