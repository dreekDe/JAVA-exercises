import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"End".equals(command)) {

            String[] tokens = command.split("\\s+");

            String currentToken = tokens[0];
            int currentIndex = Integer.parseInt(tokens[1]);
            int value = Integer.parseInt(tokens[2]);

            switch (currentToken) {
                case "Shoot":
                    shootTheTarget(targets, currentIndex, value);
                    break;
                case "Add":
                    addToTarget(targets, currentIndex, value);
                    break;
                case "Strike":
                    strikeTheIndexes(targets, currentIndex, value);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(targets.toString().replaceAll(" ","|").replaceAll("[\\[\\],]",""));
    }

    private static void strikeTheIndexes(List<Integer> list, int index, int tokenIndex) {
        if (validationByIndex(list, index)) {
            int startIndex = index - tokenIndex;
            int endIndex = index + tokenIndex;
            if (startIndex >= 0 && endIndex < list.size()) {
                for (int i = endIndex; i >= startIndex; i--) {
                    list.remove(i);
                }
            } else {
                System.out.println("Strike missed!");
            }
        }
    }

    private static void addToTarget(List<Integer> list, int index, int tokenIndex) {
        if (validationByIndex(list, index)) {
            list.add(index, tokenIndex);
        } else {
            System.out.println("Invalid placement!");
        }
    }

    private static void shootTheTarget(List<Integer> list, int index, int value) {
        if (validationByIndex(list, index)) {
            int result = list.get(index) - value;
            list.set(index, result);

            if (list.get(index) <= 0) {
                list.remove(index);
            }
        }
    }

    private static boolean validationByIndex(List<Integer> list, int index) {
        boolean isValid = false;
        if (index >= 0 && index < list.size()) {
            isValid = true;
        }
        return isValid;
    }
}
