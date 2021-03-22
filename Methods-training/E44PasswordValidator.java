import java.util.Scanner;

public class E44PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        if (passLength(password) && passLatterValid(password) && passContainsTwoDigitValid(password)) {
            System.out.println("Password is valid");
        } else {
            if (!passLength(password)) {
                System.out.println("Password must be between 6 and 10 characters");
            }
            if (!passLatterValid(password)) {
                System.out.println("Password must consist only of letters and digits");
            }
            if (!passContainsTwoDigitValid(password)) {
                System.out.println("Password must have at least 2 digits");
            }

        }
    }

    private static boolean passLength(String text) {
        boolean isValid = false;
        if (text.length() >= 6 && text.length() <= 10) {
            isValid = true;
        }
        return isValid;
    }

    private static boolean passLatterValid(String text) {
        boolean isValid = false;
        for (int i = 0; i < text.length(); i++) {
            char latter = text.charAt(i);
            if (latter >= 65 && latter <= 90 || latter >= 97 && latter <= 122 || latter >= 48 && latter <= 57) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    private static boolean passContainsTwoDigitValid(String text) {
        boolean isValid = false;
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            char latter = text.charAt(i);
            if (latter >= 48 && latter <= 57) {
                counter++;
            }
            if (counter == 2) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}