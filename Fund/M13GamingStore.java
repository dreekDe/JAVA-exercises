import java.util.Scanner;

public class M13GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        double priceOfTheGame = 0.0;
        double spent = 0.0;
        boolean flag = false;

        while (!"Game Time".equals(command)) {
            switch (command) {
                case "OutFall 4":
                    priceOfTheGame = 39.99;
                    break;
                case "CS: OG":
                    priceOfTheGame = 15.99;
                    break;
                case "Zplinter Zell":
                    priceOfTheGame = 19.99;
                    break;
                case "Honored 2":
                    priceOfTheGame = 59.99;
                    break;
                case "RoverWatch":
                    priceOfTheGame = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    priceOfTheGame = 39.99;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (currentBalance >= priceOfTheGame && priceOfTheGame != 0) {
                System.out.printf("Bought %s%n", command);
                currentBalance -= priceOfTheGame;
                spent += priceOfTheGame;
            } else if (currentBalance < priceOfTheGame) {
                System.out.println("Too Expensive");
            }
            if (currentBalance == 0) {
                System.out.println("Out of money!");
                break;
            }
            priceOfTheGame = 0;
            command = scanner.nextLine();
        }
        if (currentBalance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, currentBalance);
        }
    }
}
