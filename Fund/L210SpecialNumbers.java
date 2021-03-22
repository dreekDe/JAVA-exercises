import java.util.Scanner;

public class L210SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int digitSum = 0;
        for (int i = 1; i <= number; i++) {

            int currentNum = i;
            while (currentNum > 0) {
                digitSum += currentNum % 10;
                currentNum = currentNum / 10;
            }

            if ((digitSum == 5) || (digitSum == 7) || (digitSum == 11)) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }
            digitSum = 0;
        }
    }
}