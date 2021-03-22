package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String path = "I:\\input.txt";


        try (FileInputStream inputStream = new FileInputStream(path)) {
            int nextByte = inputStream.read();
            while (nextByte != -1) {
                System.out.printf("%s ", Integer.toBinaryString(nextByte));
                nextByte = inputStream.read();
            }
        } catch (IOException ex) {
            ex.printStackTrace();


        }
    }
}
