import java.util.Scanner;

public class E49PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            System.out.println(PalindromeIntegers(input));
            input = scanner.nextLine();
        }
    }

    private static boolean PalindromeIntegers(String input) {
        String reversInput = "";
        boolean palindrome = false;
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentSymbol = input.charAt(i);
            reversInput += "" + currentSymbol;
        }
        if (input.equals(reversInput)) {
            palindrome = true;
        }
        return palindrome;
    }
}