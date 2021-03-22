import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfTournament = scanner.nextLine();

        int winTournament = 0;
        int lostTournament = 0;

        while (!"End of tournaments".equals(nameOfTournament)) {
            int countOfGamePerTournament = Integer.parseInt(scanner.nextLine());

            int counterOfGame = 0;

            for (int i = 0; i < countOfGamePerTournament; i++) {
                int pointsOfDesiTeam = Integer.parseInt(scanner.nextLine());
                int pointOfSecondTeam = Integer.parseInt(scanner.nextLine());
                counterOfGame++;

                if (pointsOfDesiTeam > pointOfSecondTeam) {
                    winTournament++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n"
                            , counterOfGame, nameOfTournament, Math.abs(pointsOfDesiTeam - pointOfSecondTeam));
                } else {
                    lostTournament++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n"
                            , counterOfGame, nameOfTournament, Math.abs(pointsOfDesiTeam - pointOfSecondTeam));
                }
            }
            nameOfTournament = scanner.nextLine();
        }
        System.out.printf("%.2f%% matches win%n", (winTournament * 1.0 / (winTournament + lostTournament)) * 100);
        System.out.printf("%.2f%% matches lost", (lostTournament * 1.0 / (winTournament + lostTournament)) * 100);
    }
}
