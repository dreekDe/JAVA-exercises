import java.util.Arrays;
import java.util.Scanner;

public class Selling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] street = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();
    }
}
