import java.util.Scanner;

public class L35EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int sumOdd = 0;
        int sumEven = 0;
        for (int elements : numbers) {
            if (elements % 2 == 0) {
                sumEven += elements;
            } else {
                sumOdd += elements;
            }
        }
        int diff = sumEven - sumOdd;
        System.out.println(diff);
    }
}
