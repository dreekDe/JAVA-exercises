import java.util.Scanner;

public class L17TheatrePromotionsToLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if ("weekday".equals(typeOfDay)) {
            if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                price = 12;
            } else if (18 < age && age <= 64) {
                price = 18;
            }
        } else if ("weekend".equals(typeOfDay)) {
            if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                price = 15;
            } else if (18 < age && age <= 64) {
                price = 20;
            }
        } else if ("holiday".equals(typeOfDay)) {
            if (0 <= age && age <= 18) {
                price = 5;
            } else if (18 < age && age <= 64) {
                price = 12;
            } else if (64 < age && age <= 122) {
                price = 10;
            }
        }
        if (price != 0) {
            System.out.printf("%.0f$", price);
        } else {
            System.out.println("Error!");
        }
    }
}
