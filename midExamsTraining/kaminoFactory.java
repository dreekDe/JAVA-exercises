import java.util.Scanner;

public class kaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int maxSequence = Integer.MIN_VALUE;
        int[] bestDNA = new int[n];

        int counter = 1;
        while (!"Clone them!".equals(command)) {
            String[] input = command.split("!");
            int[] arr = stringToIntArray(n, input);

            if (maxValueCurrentArray(arr) > maxSequence) {
                maxSequence = maxValueCurrentArray(arr);
                bestDNA = arr;
                counter = 2;
            } else {
                counter = 1;
            }
            if (maxValueCurrentArray(arr) == maxSequence) {
                if (arr[0] < bestDNA[0]) {
                    bestDNA = arr;
                    counter = 2;
                } else if (arr[0] == bestDNA[0]) {
                    if (sumOfNumbersInTheArray(arr) > sumOfNumbersInTheArray(bestDNA)) {
                        bestDNA = arr;
                        counter = 2;
                    }
                } else {
                    counter = 1;
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", counter, sumOfNumbersInTheArray(bestDNA));
        for (int i : bestDNA) {
            System.out.print(i + " ");
        }
    }

    private static int sumOfNumbersInTheArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int maxValueCurrentArray(int[] arr) {
        int maxLength = Integer.MIN_VALUE;
        int currentLength = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 1) {
                if (arr[i] == arr[i + 1]) {
                    currentLength++;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }
                } else {
                    currentLength = 1;
                }
            }
        }
        return maxLength;
    }

    private static int[] stringToIntArray(int n, String[] input) {
        int[] array = new int[n];

        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        return array;
    }
}
