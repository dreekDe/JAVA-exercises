import java.util.Scanner;

public class E38MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {

            int sumOfDigit = 0;
            for (int j = i + 1; j <numbers.length; j++) {
                sumOfDigit= numbers[i] + numbers[j];

                if (sumOfDigit == magicSum){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }

            }
        }
    }
}
