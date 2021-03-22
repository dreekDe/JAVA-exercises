import java.util.Scanner;

public class L112EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int digit = Integer.parseInt(scanner.nextLine());
        while (digit % 2 != 0) {
            System.out.println("Please write an even number.");
            digit = Integer.parseInt(scanner.nextLine());
        }
        if (digit > 0) {
            System.out.printf("The number is: %d", digit);
        } else
            System.out.printf("The number is: %d", digit * -1);
    }
}
