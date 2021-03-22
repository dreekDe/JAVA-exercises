import java.util.Scanner;

public class M26BalancedBracketsSecondAnswer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfString = Integer.parseInt(scanner.nextLine());

        int bracketOpen = 0;
        int bracketClose = 0;

        for (int i = 0; i < countOfString; i++) {
            String input = scanner.nextLine();

            if ("(".equals(input)) {
                bracketOpen++;
            }
            if (")".equals(input)) {
                bracketClose++;
                if (bracketOpen - bracketClose != 0){
                    break;
                }
            }
        }
        if (bracketOpen != bracketClose) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}

