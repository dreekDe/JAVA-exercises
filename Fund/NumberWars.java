import java.util.Scanner;

public class NumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameFirstGamer = scanner.nextLine();
        String nameSecondGamer = scanner.nextLine();

        int pointFirstGamer = 0;
        int pointSecondGamer = 0;

        while (!"End of game".equals(nameFirstGamer) || !"End of game".equals(nameSecondGamer)) {

          String input = scanner.nextLine();

          if ("End of game".equals(input)){
              System.out.printf("%s has %d points%n",nameFirstGamer,pointFirstGamer);
              System.out.printf("%s has %d points%n",nameSecondGamer,pointSecondGamer);
              break;
          }
            int cardOfFirstGamer = Integer.parseInt(input);
            int cardOfSecondGamer = Integer.parseInt(scanner.nextLine());

            if (cardOfFirstGamer > cardOfSecondGamer) {
                pointFirstGamer += (cardOfFirstGamer - cardOfSecondGamer);
            }

            if (cardOfSecondGamer > cardOfFirstGamer) {
                pointSecondGamer += cardOfSecondGamer - cardOfFirstGamer;
            }

            if (cardOfFirstGamer == cardOfSecondGamer) {
                System.out.println("Number wars!");

                int newCardOfFirstGamer = Integer.parseInt(scanner.nextLine());
                int newCardOfSecondGamer = Integer.parseInt(scanner.nextLine());

                if (newCardOfFirstGamer > newCardOfSecondGamer) {
                    System.out.printf("%s is winner with %d points", nameFirstGamer, pointFirstGamer);
                } else {
                    System.out.printf("%s is winner with %d points", nameSecondGamer, pointSecondGamer);
                }
                break;
            }
        }
    }
}
