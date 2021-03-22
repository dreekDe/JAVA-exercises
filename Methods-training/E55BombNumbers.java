import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E55BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> target = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] tokens = scanner.nextLine().split("\\s+");
        int bomb = Integer.parseInt(tokens[0]);
        int powerOfBomb = Integer.parseInt(tokens[1]);

        for (int i = 0; i < target.size(); i++) {

            if (target.get(i) == bomb) {
                impactDetonateRight(target, powerOfBomb, i);
                impactDetonateLeft(target, powerOfBomb, i);
            }
        }
        printResult(target);
    }

    private static void printResult(List<Integer> target) {
        int sum = 0;
        for (Integer number : target) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static void impactDetonateLeft(List<Integer> target, int powerOfBomb, int i) {
        int minSizeLeft = Math.min(powerOfBomb, i);
        for (int k = i - minSizeLeft; k <= i; k++) {
            target.remove(i - minSizeLeft);
        }
    }

    private static void impactDetonateRight(List<Integer> target, int powerOfBomb, int i) {
        int minSizeRight = Math.min(powerOfBomb, target.size() - 1 - i);
        for (int j = 0; j < minSizeRight; j++) {
            target.remove(i + 1);
        }
    }
}

