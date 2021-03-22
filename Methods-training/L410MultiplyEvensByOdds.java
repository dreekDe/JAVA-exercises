import java.util.Scanner;

public class L410MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultiplyOfEvenAndOddDigits(number));
    }

    static int getMultiplyOfEvenAndOddDigits(int digit) {

        int multiplyResult = getSumOfOddDigits(digit) * getSumOfEvenDigits(digit);
        return multiplyResult;
    }

    static int getSumOfOddDigits(int digits) {
        int sumOfOddDigits = 0;
        while (digits != 0) {
            int digit = digits % 10;
            int currentNumber = digits / 10;
            if (digit % 2 != 0) {
                sumOfOddDigits += digit;
            }
            digits = currentNumber;
        }
        return sumOfOddDigits;
    }

    static int getSumOfEvenDigits(int digits) {
        int sumOfEvenDigits = 0;
        while (digits != 0) {
            int digit = digits % 10;
            int currentNumber = digits / 10;
            if (digit % 2 == 0) {
                sumOfEvenDigits += digit;
            }
            digits = currentNumber;
        }
        return sumOfEvenDigits;
    }
}


