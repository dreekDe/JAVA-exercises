import java.util.Scanner;

public class BiscuitsFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfBiscuitsPerWorker = Integer.parseInt(scanner.nextLine());
        int countOfTheWorkers = Integer.parseInt(scanner.nextLine());
        int amountOfBiscuitsFromAnotherFactory = Integer.parseInt(scanner.nextLine());


        int sumOfBiscuits = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 3 == 0) {
                double dailyProducts = Math.floor(amountOfBiscuitsPerWorker * countOfTheWorkers)*0.75;
                sumOfBiscuits += dailyProducts;
            } else {
                sumOfBiscuits += amountOfBiscuitsPerWorker * countOfTheWorkers;
            }
        }

        System.out.printf("You have produced %d biscuits for the past month.%n",sumOfBiscuits);
        int difference = sumOfBiscuits - amountOfBiscuitsFromAnotherFactory;
        double percentageDiffProduce = difference * 1.0 / amountOfBiscuitsFromAnotherFactory * 100;

        if (difference >= 0) {
            System.out.printf("You produce %.2f percent more biscuits.", percentageDiffProduce);
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(percentageDiffProduce));
        }
    }
}
