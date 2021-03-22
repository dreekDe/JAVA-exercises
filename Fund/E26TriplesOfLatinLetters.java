import java.util.Scanner;

public class E26TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char firstLatters = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char secondLatters = (char)('a'+ j);
                for (int k = 0; k < n; k++) {
                    char thirdLatters = (char)('a'+ k);

                    System.out.printf("%c%c%c%n", firstLatters, secondLatters, thirdLatters);
                }
            }
        }
    }
}
