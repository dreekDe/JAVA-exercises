import java.util.Scanner;

public class E42VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(vowelsCount(input));
    }

    private static int vowelsCount(String text) {
        int counter = 0;
        String table = "aoueiAUOEI";
        for (int i = 0; i < text.length(); i++) {
            char words = text.charAt(i);
            if (table.contains(words + "")) {
                counter++;
            }
        }
        return counter;
    }
}
