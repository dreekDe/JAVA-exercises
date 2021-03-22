package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = ".idea/input.txt";
        FileInputStream inputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(inputStream);

        FileOutputStream outputStream = new FileOutputStream("output.txt");

        int nextByte = inputStream.read();

        while (nextByte != -1) {
            if (nextByte == ' ' || nextByte == '\n') {
                outputStream.write(nextByte);
            } else {
                outputStream.write(String.valueOf(nextByte).getBytes());
            }
            nextByte = inputStream.read();
        }
        outputStream.close();

}
}