import java.util.Scanner;

public class E410TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (checkForOddDigit(number)) {
            sumOfNumberDivideOnEight(number);
        }

    }

    private static void sumOfNumberDivideOnEight(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            int currentNum = i;
            sum = sum + currentNum % 10;
            currentNum = currentNum / 10;
            if (currentNum < 10) {
                sum += currentNum;
            }
            if (sum % 8 == 0) {
                System.out.println(i);
            }
        }
    }

    private static boolean checkForOddDigit(int number) {
        boolean isValid = false;
        for (int i = 0; i <= number; i++) {
            while (i > 0) {
                double currentNum = i % 10;
                if (currentNum % 2 != 0) {
                    isValid = true;
                    break;
                }
                currentNum = currentNum / 10;
            }
            if (isValid) {
                break;
            }
        }
        return isValid;
    }

}

