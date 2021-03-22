import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();

        changeTheInentory(scanner, inventory, command);

        System.out.println(inventory.toString().replaceAll("[\\[\\]]",""));

    }

    private static void changeTheInentory(Scanner scanner, List<String> inventory, String command) {
        while (!"Craft!".equals(command)) {
            String[] tokens = command.split(" - ");

            switch (tokens[0]) {
                case "Collect":
                    collectElement(inventory, tokens[1]);
                    break;
                case "Drop":
                    dropElement(inventory, tokens[1]);
                    break;
                case "Combine Items":
                    combineElement(inventory, tokens[1]);
                    break;
                case "Renew":
                    renewElement(inventory, tokens[1]);
                    break;
            }
            command = scanner.nextLine();
        }
    }

    private static void renewElement(List<String> inventory, String token) {
        if (inventory.contains(token)) {
            inventory.remove(token);
            inventory.add(token);
        }
    }

    private static void combineElement(List<String> inventory, String token) {
        String[] tasks = token.split(":");
        String element = tasks[0];
        if (inventory.contains(element)){
            int index = inventory.indexOf(tasks[0]);
            inventory.add(index+1, tasks[1]);
        }
    }

    private static void dropElement(List<String> inventory, String token) {
        inventory.remove(token);
    }

    private static void collectElement(List<String> inventory, String token) {
        if (!inventory.contains(token)) {
            inventory.add(token);
        }
    }
}
