
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");


            switch (tokens[0]) {
                case "swap":
                    int index = Integer.parseInt(tokens[1]);
                    int newIndex = Integer.parseInt(tokens[2]);
                    int temp = numbers.get(newIndex);
                    numbers.set(newIndex, numbers.get(index));
                    numbers.set(index, temp);

                    break;
                case "multiply":
                    index = Integer.parseInt(tokens[1]);
                    newIndex = Integer.parseInt(tokens[2]);
                    temp = numbers.get(index) * numbers.get(newIndex);
                    numbers.set(index, temp);
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i, numbers.get(i)-1);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}