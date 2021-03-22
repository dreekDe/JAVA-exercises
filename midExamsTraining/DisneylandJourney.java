import java.util.Scanner;

public class DisneylandJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int needSumForTrip = Integer.parseInt(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());

        double safeTheMoney = 0.0;

        for (int i = 1; i <= month; i++) {
            if (i > 1) {
                if (i % 2 != 0) {
                    safeTheMoney -= (safeTheMoney * 16) / 100;
                } else if (i % 4 == 0) {
                    safeTheMoney += (safeTheMoney * 25) / 100;
                }
                safeTheMoney += (needSumForTrip * 1.0 * 25) / 100;

            } else {
                safeTheMoney += (needSumForTrip * 1.0 * 25) / 100;
            }
        }
        printResult(needSumForTrip, safeTheMoney);

    }


    private static void printResult(int needSumForTrip, double safeTheMoney) {
        if (safeTheMoney > needSumForTrip) {
            double moneyPerSouvenirs = safeTheMoney - needSumForTrip;
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", moneyPerSouvenirs);
        } else {
            double outOfMoney = needSumForTrip * 1.0 - safeTheMoney;
            System.out.printf("Sorry. You need %.2flv. more.", outOfMoney);
        }
    }
}
