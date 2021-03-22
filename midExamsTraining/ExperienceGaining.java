import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());

        int countOfBattles = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        double currentExperience = 0.0;
        boolean success = false;

        for (int i = 0; i < countOfBattles; i++) {
            double experienceEarnedPerBattle = Double.parseDouble(scanner.nextLine());
            counter++;

            if (counter % 3 == 0) {
                currentExperience += experienceEarnedPerBattle * 1.15;
            } else if (counter % 5 == 0) {
                currentExperience += experienceEarnedPerBattle * 0.90;
            } else {
                currentExperience += experienceEarnedPerBattle;
            }

            if (currentExperience >= neededExperience) {
                success = true;
                break;
            }
        }

        if (success) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", counter);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", (neededExperience - currentExperience));
        }

    }
}
