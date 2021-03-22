import java.util.Scanner;

public class E43CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);


        printCharactersFromCharToChar(a,b);
    }

    private static void printCharactersFromCharToChar(char start, char end) {
        if (start > end) {
            for (int i = end + 1; i < start; i++) {
                System.out.printf("%c" + " ", i);
            }
        } else {

            for (int i = start + 1; i < end; i++) {
                System.out.printf("%c" + " ", i);
            }
        }
    }
}

