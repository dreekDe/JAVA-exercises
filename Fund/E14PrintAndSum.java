import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class E14PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endtNumber = Integer.parseInt(scanner.nextLine());

        int sumOfnumbers = 0;

        for (int i = startNumber; i <= endtNumber; i++) {
            sumOfnumbers += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("Sum: %d",sumOfnumbers);


    }
}
