import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E52ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");

            if ("Delete".equals(tokens[0])) {
                delleteIndexByValue(numbers, tokens[1]);

            } else if ("Insert".equals(tokens[0])) {
                int value = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                numbers.add(index,value );
            }

            command = scanner.nextLine();
        }

        System.out.print(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> delleteIndexByValue(List<Integer> list, String token) {
        int value = Integer.parseInt(token);
        while (list.contains(value)) {
            list.remove(Integer.valueOf(value));
        }
        return list;
    }
}

