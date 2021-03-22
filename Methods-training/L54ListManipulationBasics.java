import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L54ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(tokens[1]));
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(tokens[1]));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(tokens[2]), Integer.valueOf(tokens[1]));
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}


