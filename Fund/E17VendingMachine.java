import java.util.Scanner;

public class E17VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalMoney = 0.0;
        while (!"Start".equals(input)) {
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2) {
                totalMoney += money;
            } else {
                System.out.printf("Cannot accept %.02f%n", money);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        double price = 0.0;
        boolean corectProduct = true;
        while (!"End".equals(product)) {
            switch (product) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.50;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    corectProduct = false;
            }
            if (corectProduct) {
                if (price > totalMoney) {
                    System.out.println("Sorry, not enough money");
                } else {
                    totalMoney -= price;
                    System.out.printf("Purchased %s%n", product);
                }
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney);
    }
}