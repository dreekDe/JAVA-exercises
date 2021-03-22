import java.util.Arrays;
import java.util.Scanner;

public class ArcheryTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\|")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
        int sum = 0;
        while (!"Game over".equals(command)) {
            String[] tokens = command.split("@");

            if ("Reverse".equals(tokens[0])) {
                reverseMassive(targets);
            } else {

                int startIndex = Integer.parseInt(tokens[1]);
                int lengthOfShoot = Integer.parseInt(tokens[2]);

                if (startIndex >= 0 && startIndex < targets.length) {

                    sum = shootTheTargets(targets, sum, tokens[0], startIndex, lengthOfShoot);
                }
            }
            command = scanner.nextLine();
        }
        printMassive(targets);
        System.out.printf("Iskren finished the archery tournament with %d points!", sum);
    }

    private static void printMassive(int[] targets) {
        for (int i = 0; i < targets.length-1; i++) {
            System.out.print(targets[i] + " - ");
        }
        System.out.println(targets[targets.length-1]);
    }

    private static int shootTheTargets(int[] targets, int sum, String token, int startIndex, int lengthOfShoot) {
        switch (token) {
            case "Shoot Left":
                sum = shootLeft(targets, sum, startIndex, lengthOfShoot);
                break;
            case "Shoot Right":
                sum = shootRight(targets, sum, startIndex, lengthOfShoot);
                break;
        }
        return sum;
    }

    private static void reverseMassive(int[] targets) {
        for (int i = 0; i < targets.length / 2; i++) {
            int tmp = targets[i];
            targets[i] = targets[targets.length - i - 1];
            targets[targets.length - i - 1] = tmp;
        }
    }

    private static int shootRight(int[] targets, int sum, int startIndex, int lengthOfShoot) {
        int currentIndex;
        currentIndex = startIndex + lengthOfShoot;
        if (currentIndex > targets.length - 1) {
            while (currentIndex > targets.length - 1) {
                currentIndex -= targets.length;
            }
        }
        sum = getSum(targets, sum, currentIndex);
        return sum;
    }

    private static int shootLeft(int[] targets, int sum, int startIndex, int lengthOfShoot) {
        int currentIndex;
        currentIndex = startIndex - lengthOfShoot;
        if (currentIndex < 0) {
            while (currentIndex < 0) {
                currentIndex += targets.length;
            }
        }
        sum = getSum(targets, sum, currentIndex);
        return sum;
    }

    private static int getSum(int[] targets, int sum, int currentIndex) {
        if (targets[currentIndex] >= 5) {
            targets[currentIndex] = targets[currentIndex] - 5;
            sum += 5;
        } else {
            sum += targets[currentIndex];
            targets[currentIndex] = 0;
        }
        return sum;
    }
}
