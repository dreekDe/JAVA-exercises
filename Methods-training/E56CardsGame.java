import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E56CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayersCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPlayersCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i < firstPlayersCards.size(); i++) {

            if (firstPlayersCards.get(i) > secondPlayersCards.get(i)) {
                firstPlayersCards.add(firstPlayersCards.get(i));
                firstPlayersCards.add(secondPlayersCards.get(i));

            } else if (firstPlayersCards.get(i) < secondPlayersCards.get(i)) {
                secondPlayersCards.add(secondPlayersCards.get(i));
                secondPlayersCards.add(firstPlayersCards.get(i));
            }
            firstPlayersCards.remove(i);
            secondPlayersCards.remove(i);

            if (secondPlayersCards.size() == 0) {
                break;
            }
            i = -1;
        }

        printTheWinner(firstPlayersCards, secondPlayersCards);

    }

    private static void printTheWinner(List<Integer> list, List<Integer> list1) {
        if (resultByWinner(list) > resultByWinner(list1)) {
            System.out.printf("First player wins! Sum: %d", resultByWinner(list));
        } else {
            System.out.printf("Second player wins! Sum: %d", resultByWinner(list1));
        }
    }

    private static int resultByWinner(List<Integer> list) {
        int sum = 0;
        for (Integer element : list) {
            sum += element;
        }
        return sum;
    }
}



