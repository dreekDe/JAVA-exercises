import java.util.Scanner;

public class E46MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacters(input);
    }

    private static void printMiddleCharacters(String text) {
        if (text.length() % 2 != 0) {
            String letter = "";
            for (int i = 0; i <= text.length() / 2; i++) {
                char currentLatter = text.charAt(i);
                letter = "" + currentLatter;
            }
            System.out.println(letter);
        } else {
            String letter = "";
            for (int i = (text.length()/2) -1; i <= text.length() / 2; i++) {
                char currentLatter = text.charAt(i);
                letter += currentLatter;
            }
            System.out.println(letter);

        }
    }
}