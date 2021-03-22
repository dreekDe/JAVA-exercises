import java.util.Scanner;

public class E29SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYieldSpiceOfDay = Integer.parseInt(scanner.nextLine());
        int totalAmountOfSpice = 0;
        int daysCounter = 0;

        while (startYieldSpiceOfDay >= 100) {
            totalAmountOfSpice += startYieldSpiceOfDay;
            startYieldSpiceOfDay -= 10;
            daysCounter++;

            if (totalAmountOfSpice >= 26) {
                totalAmountOfSpice -= 26;
            }else{
                break;
            }
            if (startYieldSpiceOfDay < 100) {
                totalAmountOfSpice -= 26;
                break;
            }
        }
        System.out.println(daysCounter);
        System.out.println(totalAmountOfSpice);
    }
}

