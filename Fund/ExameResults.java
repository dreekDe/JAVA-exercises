import java.util.Scanner;

public class ExameResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String comand = scanner.nextLine();

        boolean flag = false;

        while (!"Midnight".equals(comand)) {

            int result = 0;
            for (int i = 0; i < 6; i++) {
                int evaluation = Integer.parseInt(scanner.nextLine());
                if (evaluation < 0) {
                    flag = true;
                    break;
                }
                result += evaluation;
            }
            double finalPoints = Math.floor((result * 1.0 / 600) * 100);
            double finalEvaluation = finalPoints * 0.06;

            if (finalEvaluation < 3) {
                finalEvaluation = 2;
            }
            if (finalEvaluation >= 5) {
                System.out.println("===================");
                System.out.println("|   CERTIFICATE   |");
                System.out.printf("|    %.2f/6.00    |%n", finalEvaluation);
                System.out.println("===================");
                System.out.printf("Issued to %s", comand);
            } else if (flag) {
                System.out.printf("%s was cheating!%n", comand);
            } else {
                System.out.printf("%s - %.2f%n", comand, finalEvaluation);
            }
            comand = scanner.nextLine();
        }
    }
}

