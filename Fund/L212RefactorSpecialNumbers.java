import java.util.Scanner;

public class L212RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sumOfDigit = 0;

        for (int i = 1; i <= input; i++) {
            int currentNum = i;
            while (currentNum > 0) {
                sumOfDigit += currentNum % 10;
                currentNum = currentNum / 10;
            }
            boolean isSpecial = (sumOfDigit == 5) || (sumOfDigit == 7) || (sumOfDigit == 11);
            if (isSpecial) {
                System.out.printf("%d -> True%n", i, isSpecial);
            } else {
                System.out.printf("%d -> False%n", i, isSpecial);
            }
            sumOfDigit = 0;

        }
    }
}
