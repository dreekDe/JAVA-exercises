import java.util.Scanner;

public class E210PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int countPoked = 0;
        int currentPower = startPokePower;

        while (distanceBetweenTargets <= currentPower) {
            currentPower -= distanceBetweenTargets;
            countPoked++;

            if (currentPower == (startPokePower / 2.0) && exhaustionFactor != 0) {
                currentPower = currentPower / exhaustionFactor;
            }
        }
        System.out.println(currentPower);
        System.out.println(countPoked);

    }
}
