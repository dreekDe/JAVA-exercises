import java.util.Scanner;

public class E13Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String typeOfDay = scanner.nextLine();

        double price = 0.0;

        if ("Friday".equals(typeOfDay)) {
            switch (typeOfGroup) {
                case "Students":
                    if (people >= 30) {
                        price = (people * 8.45) * 0.85;
                        break;
                    } else {
                        price = people * 8.45;
                        break;
                    }
                case "Business":
                    if (people >= 100) {
                        price = (people * 10.90) - (10 * 10.90);
                        break;
                    } else {
                        price = people * 10.90;
                        break;
                    }
                case "Regular":
                    if (people >= 10 && people <= 20) {
                        price = (people * 15) * 0.95;
                        break;
                    } else {
                        price = people * 15;
                        break;
                    }
            }
        } else if ("Saturday".equals(typeOfDay)) {
            switch (typeOfGroup) {
                case "Students":
                    if (people >= 30) {
                        price = (people * 9.8) * 0.85;
                        break;
                    } else {
                        price = people * 9.80;
                        break;
                    }
                case "Business":
                    if (people >= 100) {
                        price = (people * 15.60) - (10 * 15.60);
                        break;
                    } else {
                        price = people * 15.60;
                        break;
                    }
                case "Regular":
                    if (people >= 10 && people <= 20) {
                        price = (people * 20) * 0.95;
                        break;
                    } else {
                        price = people * 20;
                        break;
                    }
            }
        } else if ("Sunday".equals(typeOfDay)) {
            switch (typeOfGroup) {
                case "Students":
                    if (people >= 30) {
                        price = (people * 10.46) * 0.85;
                        break;
                    } else {
                        price = people * 10.46;
                        break;
                    }
                case "Business":
                    if (people >= 100) {
                        price = (people * 16) - (10 * 16);
                        break;
                    } else {
                        price = people * 16;
                        break;
                    }
                case "Regular":
                    if (people >= 10 && people <= 20) {
                        price = (people * 22.50) * 0.95;
                        break;
                    } else {
                        price = people * 22.50;
                        break;
                    }
            }
        }
        System.out.printf("Total price: %.2f",price);
    }
}