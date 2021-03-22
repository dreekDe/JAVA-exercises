import java.text.DecimalFormat;
import java.util.Scanner;

public class L411MathOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double numberB = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(operationWithTwoNumbers(numberA, input, numberB)));
    }

    static double operationWithTwoNumbers(double a, String input, double b) {
        double result = 0.0;
        if ("+".equals(input)) {
            result = addTwoNumbers(a, b);
        } else if ("-".equals(input)) {
            result = subtractTwoNumbers(a, b);
        } else if ("*".equals(input)) {
            result = multiplyTwoNumbers(a, b);
        } else if ("/".equals(input)) {
            result = divideTwoNumbers(a, b);
        }
        return result;
    }

    static double addTwoNumbers(double a, double b) {
        return a + b;
    }

    static double subtractTwoNumbers(double a, double b) {
        return a - b;
    }

    static double multiplyTwoNumbers(double a, double b) {
        return a * b;
    }

    static double divideTwoNumbers(double a, double b) {
        return a / b;
    }
}
