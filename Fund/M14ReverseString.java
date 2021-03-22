import java.util.Scanner;

public class M14ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String newWord = " ";

        for (int i = input.length() - 1; i >= 0; i--) {
            newWord += input.charAt(i);
        }
        System.out.println(newWord);
    }
}
