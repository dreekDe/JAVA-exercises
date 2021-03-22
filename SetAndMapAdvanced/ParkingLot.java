package SetAndMapAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashSet<String> cars = new LinkedHashSet<>();

        while (!"END".equals(input)) {

            String[] tokens = input.split(", ");
            String command = tokens[0];
            String car = tokens[1];

            switch (command) {
                case "IN":
                    cars.add(car);
                    break;
                case "OUT":
                    cars.remove(car);
                    break;
            }
            input = scanner.nextLine();
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            System.out.println(String.join(System.lineSeparator(), cars));
        }
    }
}
