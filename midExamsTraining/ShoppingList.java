import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> glossary = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"Go Shopping!".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Urgent":
                    if (!glossary.contains(tokens[1])) {
                        glossary.add(0, tokens[1]);
                    }
                    break;
                case "Unnecessary":
                    glossary.remove(tokens[1]);
                    break;
                case "Correct":
                    if (glossary.contains(tokens[1])) {
                        int index = glossary.indexOf(tokens[1]);
                        glossary.set(index, tokens[2]);
                    }
                    break;
                case "Rearrange":
                    if (glossary.contains(tokens[1])) {
                        glossary.remove(tokens[1]);
                        glossary.add(tokens[1]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }


        System.out.println(glossary.toString().replaceAll("[\\[\\]]", ""));

    }
}
