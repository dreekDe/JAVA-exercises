import java.util.Scanner;

public class E37MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int currentLength = 1;
        int bestLength = 0;
        int index = 0;

        for (int i = 0; i < input.length - 1; i++) {

            int currentElement = numbers[i];
            int nextElement = numbers[i + 1];

            if (currentElement == nextElement) {
                currentLength++;

                if (currentLength > bestLength) {
                    bestLength = currentLength;
                    index = numbers[i];
                }
            } else {
                currentLength = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(index + " ");
        }
    }
}
