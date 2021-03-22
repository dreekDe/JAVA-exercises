import java.util.Scanner;

public class L47RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(text,repeatTimes));
    }

    private static String repeatString(String command, int n) {
       String result = "";
        for (int i = 0; i < n; i++) {
           result += command;
        }
        return result;
    }
}
