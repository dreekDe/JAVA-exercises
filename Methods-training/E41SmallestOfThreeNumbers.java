import java.util.Scanner;

public class E41SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        System.out.println(SmallestOfThreeNumbers(a, b, c));

    }

    private static int SmallestOfThreeNumbers(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }
}
