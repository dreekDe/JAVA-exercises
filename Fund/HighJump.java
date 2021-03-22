import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goals = Integer.parseInt(scanner.nextLine());

        int startTrainers = goals - 30;
        int counterAttempts = 0;
        int counterJumps = 0;

        while (goals >= startTrainers) {
            int attemp = Integer.parseInt(scanner.nextLine());
            counterJumps++;

            if (attemp > startTrainers) {
                startTrainers += 5;
                counterAttempts = 0;
            } else {
                counterAttempts++;
                if (counterAttempts == 3) {
                    System.out.printf("Tihomir failed at %dcm after %d jumps.", startTrainers, counterJumps);
                    break;
                }
            }
            if (attemp > goals) {
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", goals, counterJumps);
                break;
            }
        }
    }
}
