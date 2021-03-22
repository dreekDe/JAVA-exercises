import java.util.Scanner;

public class E48FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

       System.out.printf("%.2f", 1.0 * (divisionFactorialsFromTwoNumbers(num1, num2)));

    }


    private static long divisionFactorialsFromTwoNumbers(int a, int b) {
        return factorialFromDigit(a) / factorialFromDigit(b);
    }


    private static long factorialFromDigit(int a) {
        long factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }

        return factorial;
    }
}