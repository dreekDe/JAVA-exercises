import java.util.Scanner;

public class E24SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            int symbol = scanner.nextLine().charAt(0);
            sum += symbol;

        }
        System.out.println("The sum equals: " + sum);


    }
}
