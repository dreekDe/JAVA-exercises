import java.util.Scanner;

public class L26CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            char input = scanner.nextLine().charAt(0);
            System.out.print(input);
        }
    }
}
