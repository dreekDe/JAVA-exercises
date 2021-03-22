import java.util.Scanner;

public class E110RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lostGameCount = Double.parseDouble(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double kayboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countetHeadsets = 0;
        int counterMouses = 0;
        int counterKayboards = 0;
        int counterDisplay = 0;
        for (int i = 1; i <= lostGameCount; i++) {
            if (i % 2 == 0) {
                countetHeadsets++;
            }
            if (i % 3 == 0) {
                counterMouses++;
            }
            if (i % 6 == 0) {
                counterKayboards++;
                if (counterKayboards % 2 == 0) {
                    counterDisplay++;
                }
            }
        }
        double costsPerNewEqupments = (counterDisplay * displayPrice) +
                (counterKayboards * kayboardPrice) +
                (counterMouses * mousePrice) +
                (countetHeadsets * headsetPrice);

        System.out.printf("Rage expenses: %.2f lv.", costsPerNewEqupments);
    }
}
