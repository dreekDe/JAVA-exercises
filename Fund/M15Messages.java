import java.util.Scanner;

public class M15Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counterOfWords = Integer.parseInt(scanner.nextLine());
        String words = " ";

        for (int i = 0; i < counterOfWords; i++) {
            String input = scanner.nextLine();
            int mainOfDigit = Integer.parseInt(String.valueOf(input.charAt(0)));
            int offsetOfDigit = (mainOfDigit - 2) * 3;

            if (mainOfDigit == 8 || mainOfDigit == 9) {
                offsetOfDigit += 1;
            }
            int lengtOfInput = input.length();
            int latterOfIndex = offsetOfDigit + lengtOfInput - 1 + 97;
            char indexAsci = (char) latterOfIndex;

            if (input.equals("0")) {
                words += " ";
            } else {
                words += indexAsci;
            }
        }
        System.out.printf("%s",words);
    }
}