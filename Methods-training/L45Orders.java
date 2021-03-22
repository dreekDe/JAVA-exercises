import java.util.Scanner;

public class L45Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        orderCalculation(scanner);
    }

    private static void orderCalculation(Scanner scanner) {
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        System.out.printf("%.2f",price * quantity);
    }
}
