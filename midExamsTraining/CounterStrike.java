import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        boolean isWonBattle = true;
        int wonBattle = 0;
        int currentBattle = 0;
        while (!"End of battle".equals(command)) {
            int distance = Integer.parseInt(command);

            if (energy >= distance) {
                wonBattle++;
                currentBattle++;
                energy -= distance;
            } else {
                isWonBattle = false;
                break;
            }
            if (currentBattle == 3) {
                energy += wonBattle;
                currentBattle = 0;
            }

            command = scanner.nextLine();
        }

        if (isWonBattle) {
            System.out.printf("Won battles: %d. Energy left: %d",wonBattle,energy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattle, energy);
        }
    }
}
