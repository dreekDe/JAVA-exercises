import java.util.Scanner;

public class L41SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        typeOfNumber(number);

    }

    private static void typeOfNumber(int number) {

        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number > 0) {
            System.out.printf("The number %d is positie.", number);
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}

