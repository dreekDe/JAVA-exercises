import java.util.Scanner;

public class M24RefactoringPrimeCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= input; i++) {
            boolean isPrime = true;
            for (int devision = 2; devision < i; devision++) {
                if (i % devision == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, isPrime);
        }

    }
}
