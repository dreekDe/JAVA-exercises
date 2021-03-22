import java.util.*;
import java.util.stream.Collectors;

public class WizardPoker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wizardCards = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());

        String command = scanner.nextLine();

        List<String> cards = new ArrayList<>();

        while (!"Ready".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Add":
                    if (wizardCards.contains(tokens[1])) {
                        cards.add(tokens[1]);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (wizardCards.contains(tokens[1]) && index >= 0 && index < cards.size()) {
                        cards.add(index, tokens[1]);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    if (cards.contains(tokens[1])) {
                        cards.remove(tokens[1]);
                    }else{
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    String temp = tokens[2];
                    cards.add(cards.indexOf(tokens[2]), tokens[1]);
                    cards.remove(tokens[2]);
                    cards.set(cards.indexOf(tokens[1]), temp);
                    break;
                case "Shuffle":
                    Collections.reverse(cards);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ",cards));
    }
}

