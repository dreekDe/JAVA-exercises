import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int health = 100;
        int startCoins = 0;
        int bestRoom = 0;
        boolean iskilled = false;
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (String room : rooms) {
            bestRoom++;

            String[] tokens = room.split("\\s+");

            switch (tokens[0]) {
                case "potion":
                    health = getHealth(health, tokens);
                    break;
                case "chest":
                    startCoins = getStartCoins(startCoins, tokens);
                    break;
                default:
                    health -= Integer.parseInt(tokens[1]);

                    if (health <= 0) {
                        System.out.printf("You died! Killed by %s.%n", tokens[0]);
                        System.out.printf("Best room: %d%n", bestRoom);
                        iskilled = true;
                        break;
                    } else {
                        System.out.printf("You slayed %s.%n", tokens[0]);
                    }
            }
            if (iskilled) {
                break;
            }
        }
        if (!iskilled) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", startCoins);
            System.out.printf("Health: %d%n", health);
        }

    }

    private static int getStartCoins(int startCoins, String[] tokens) {
        startCoins += Integer.parseInt(tokens[1]);
        System.out.printf("You found %d bitcoins.%n", Integer.parseInt(tokens[1]));
        return startCoins;
    }

    private static int getHealth(int health, String[] tokens) {
        int temp = health;
        health += Integer.parseInt(tokens[1]);
        if (health > 100) {
            health = 100;
            System.out.printf("You healed for %d hp.%n", (100 - temp));
        } else {
            System.out.printf("You healed for %d hp.%n", Integer.parseInt(tokens[1]));
        }
        System.out.printf("Current health: %d hp.%n", health);
        return health;
    }
}