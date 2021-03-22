import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!"Retire".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Fire":
                    int currentIndex = Integer.parseInt(tokens[1]);
                    if (currentIndex >= 0 && currentIndex < warShip.size()) {
                        warShip.set(currentIndex, warShip.get(currentIndex) - Integer.parseInt(tokens[2]));

                        if (warShip.get(currentIndex) <= 0) {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if ((startIndex >= 0 && startIndex < pirateShip.size()) && (endIndex >= 0 && endIndex < pirateShip.size())) {
                        for (int i = startIndex; i <= endIndex; i++) {
                            pirateShip.set(i, pirateShip.get(i) - Integer.parseInt(tokens[3]));
                            if (pirateShip.get(i) <= 0) {
                                System.out.println("You lost! The pirate ship has sunken.");
                                return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int indexToRepair = Integer.parseInt(tokens[1]);
                    if (indexToRepair >= 0 && indexToRepair < pirateShip.size()) {
                        pirateShip.set(indexToRepair, pirateShip.get(indexToRepair) + Integer.parseInt(tokens[2]));
                        if (pirateShip.get(indexToRepair) > maxHealth) {
                            pirateShip.set(indexToRepair, maxHealth);
                        }
                    }
                    break;
                case "Status":
                    int counter = 0;
                    for (int i = 0; i < pirateShip.size(); i++) {
                        double percentageOfHealth = maxHealth * 0.20;
                        if (pirateShip.get(i) < percentageOfHealth) {
                            counter++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", counter);
                    break;
            }
            command = scanner.nextLine();
        }

        int sumOfHealthPirateShip = 0;
        for (int i = 0; i < pirateShip.size(); i++) {
            sumOfHealthPirateShip += pirateShip.get(i);
        }

        int sumOfHealthWarShip = 0;
        for (int i = 0; i < warShip.size(); i++) {
            sumOfHealthWarShip += warShip.get(i);
        }

        System.out.printf("Pirate ship status: %d%n", sumOfHealthPirateShip);
        System.out.printf("Warship status: %d", sumOfHealthWarShip);
    }
}