package StreamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;

public class CopyAPicture {
    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\isk\\IdeaProjects\\Stack and Queues\\DSC03460.JPG";

        byte[] bytes = Files.readAllBytes(Path.of(path));

        String encode = Base64.getEncoder().encodeToString(bytes);

  new PrintWriter("img.txt").write(encode);

    }
}
