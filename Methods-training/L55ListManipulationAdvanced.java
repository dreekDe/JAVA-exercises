import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L55ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Contains":
                    printResultToContain(numbers, tokens[1]);
                    break;
                case "Print":
                    if ("even".equals(tokens[1])) {
                        printEven(numbers);
                    } else if ("odd".equals(tokens[1])) {
                        printOdd(numbers);
                    }
                    break;
                case "Get":
                    if ("sum".equals(tokens[1])) {
                        System.out.print(resultSum(numbers));
                    }
                    break;
                case "Filter":
                    if (">".equals(tokens[1])) {
                        printGreaterThenNumber(numbers, tokens[2]);
                    } else if ("<".equals(tokens[1])) {
                        printLessThenNumber(numbers, tokens[2]);
                    } else if (">=".equals(tokens[1])) {
                        printGreaterOrEqualsThenNumber(numbers, tokens[2]);
                    } else if ("<=".equals(tokens[1])) {
                        printLessOrEqualsThenNumber(numbers, tokens[2]);
                    }
                    break;
            }
            command = scanner.nextLine();
            System.out.println();
        }

    }

    private static void printLessOrEqualsThenNumber(List<Integer> numbers, String token) {
        for (Integer number : numbers) {
            if (number <= Integer.parseInt(token)) {
                System.out.print(number + " ");
            }
        }
    }

    private static void printGreaterOrEqualsThenNumber(List<Integer> numbers, String token) {
        for (Integer number : numbers) {
            if (number >= Integer.parseInt(token)) {
                System.out.print(number + " ");
            }
        }
    }

    private static void printLessThenNumber(List<Integer> numbers, String token) {
        for (Integer number : numbers) {
            if (number < Integer.parseInt(token)) {
                System.out.print(number + " ");
            }
        }
    }

    private static void printGreaterThenNumber(List<Integer> numbers, String token) {
        for (Integer number : numbers) {
            if (number > Integer.parseInt(token)) {
                System.out.print(number + " ");
            }
        }
    }

    private static int resultSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    private static void printResultToContain(List<Integer> numbers, String token) {
        boolean isContain = false;
        for (Integer number : numbers) {
            if (number == Integer.parseInt(token)) {
                isContain = true;
                System.out.print("Yes");
                break;
            }
        }
        if (!isContain) {
            System.out.print("No such number");
        }

    }

    private static void printOdd(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }

    }

    private static void printEven(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
