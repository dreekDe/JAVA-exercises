package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

//        Path path = Paths.get("input.txt");
//        Path outputPath = Paths.get("output.txt");
//
//        try {
//            List<String> strings = Files.readAllLines(path).stream().sorted(String::compareTo).collect(Collectors.toList());
//            Files.write(outputPath,strings);
//        }catch (IOException ex){
//            ex.printStackTrace();
//        }
//    }
        List<String> strings = Files.readAllLines(Paths.get(".idea/input.txt"))
                .stream().sorted(String::compareTo)
                .collect(Collectors.toList());
        Files.write(Paths.get("output.txt"), strings);
    }
}