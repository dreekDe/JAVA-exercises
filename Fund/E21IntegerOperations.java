import java.util.Scanner;

public class E21IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double d = Double.parseDouble(scanner.nextLine());

        double result =(Math.floor((a + b)/c))*d;

        System.out.printf("%.0f",result);;

    }
}
