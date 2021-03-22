import java.util.Scanner;

public class L27ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firsChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char thirdChar = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c",thirdChar,secondChar,firsChar);
    }
}