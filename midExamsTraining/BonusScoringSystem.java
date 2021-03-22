import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int courses = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int startBonus = Integer.parseInt(scanner.nextLine());

        double totalBonus = 0.0;
        double bestBonus = 0.0;
        double currentLectures = 0.0;

        for (int i = 0; i < courses; i++) {

            double attendansec = Double.parseDouble(scanner.nextLine());
            totalBonus = attendansec / lectures * (5 + startBonus);

            if (totalBonus > bestBonus) {
                bestBonus = totalBonus;
                currentLectures = attendansec;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(bestBonus));
        System.out.printf("The student has attended %.0f lectures.",currentLectures);
    }
}