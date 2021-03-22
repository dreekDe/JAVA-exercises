import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] street = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        int targetPosition = 0;
        while (!"Love!".equals(command)) {
            String[] tokens = command.split("\\s+");
            if ("Jump".equals(tokens[0])) {

                targetPosition += Integer.parseInt(tokens[1]);

                if (targetPosition < 0 || targetPosition > street.length - 1) {
                    targetPosition = 0;
                }

                if (street[targetPosition] == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", targetPosition);
                } else {
                    street[targetPosition] -= 2;

                    if (street[targetPosition] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", targetPosition);
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", targetPosition);

        int counter = 0;
        for (int house : street) {
            if (house != 0) {
               counter++;
            }
        }

        if (counter == 0) {
            System.out.print("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", counter);
        }
    }
}

