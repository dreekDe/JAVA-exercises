import java.util.Scanner;

public class L49GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeToVariable = scanner.nextLine();
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();


        if ("int".equals(typeToVariable)) {
            System.out.println(intGreaterToValues(firstInput, secondInput));
        } else if ("char".equals(typeToVariable)) {
            System.out.println(charGreaterTwoValues(firstInput, secondInput));
        } else {
            stringGreaterToValues(firstInput, secondInput);

        }
    }

    static void stringGreaterToValues(String a, String b) {

        int lengthOfFirstString = 0;
        for (int i = 0; i < a.length(); i++) {
            lengthOfFirstString++;
        }
        int lengthOfSecondString = 0;
        for (int i = 0; i < b.length(); i++) {
            lengthOfSecondString++;
        }

        if (lengthOfFirstString > lengthOfFirstString) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }

    static int intGreaterToValues(String a, String b) {
        int firstNumber = Integer.parseInt(a);
        int secondNumber = Integer.parseInt(b);
        return Math.max(firstNumber, secondNumber);

    }

    static char charGreaterTwoValues(String a, String b) {
        char firstChar = a.charAt(0);
        char secondChar = b.charAt(0);
        char maxIndexOfChar = ' ';
        if (firstChar > secondChar) {
            maxIndexOfChar = firstChar;
        } else {
            maxIndexOfChar = secondChar;
        }
        return maxIndexOfChar;
    }
}
