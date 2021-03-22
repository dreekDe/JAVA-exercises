import java.util.Scanner;

public class E45AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractOfTwoNumbers(a,b,c));


    }

    private static long addOfTwoNumbers(long a,long b) {
        long sum = a+b;
        return sum;
    }
    private static long subtractOfTwoNumbers(long a,long b, long c) {
        long sum = (addOfTwoNumbers(a,b) - c);
        return sum;
    }


}
