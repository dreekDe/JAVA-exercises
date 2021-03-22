import java.util.Scanner;

public class E15Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String corectPass = "";
        boolean isLogged = false;

        for (int j = name.length() - 1; j >= 0; j--) {
            corectPass += name.charAt(j);
        }
        for (int i = 1; i <= 4; i++) {
            String currentPassword = scanner.nextLine();
            if (corectPass.equals(currentPassword)) {
                isLogged = true;
                System.out.print(String.format("User %s logged in.", name));
                break;
            } else if (i < 4) {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!isLogged) {
            System.out.print(String.format("User %s blocked!", name));
        }
    }
}
