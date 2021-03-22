import java.util.Scanner;

public class M25M26BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfString = Integer.parseInt(scanner.nextLine());

        String bracket = "";
        boolean unbalanced = false;
        for (int i = 0; i < countOfString; i++) {
            String input = scanner.nextLine();

            if ("(".equals(input) && (bracket.equals("") || bracket.equals(")"))) {
                bracket = input;
            } else if (")".equals(input) && bracket.equals("(")) {
                bracket = input;
            } else if (")".equals(input) && bracket.equals(")")
                    || ")".equals(input) && bracket.equals("")
                    || "(".equals(input) && bracket.equals("(")) {
                unbalanced = true;
                break;
            }
        }
        if (unbalanced) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
