import java.util.Scanner;

public class L32PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[counter];

        for (int i = 0; i < counter; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = counter - 1; j >= 0; j--) {
            System.out.print(numbers[j] + " ");
        }
    }
}


