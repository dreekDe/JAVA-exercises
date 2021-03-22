package SetAndMapAdvanced;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, LinkedHashSet<String>> playersWithDecks = new LinkedHashMap<>();

        while (!"JOKER".equals(input)) {
            String[] tokens = input.split(": ");
            String player = tokens[0];
            String[] hands = (tokens[1].split(", "));

            playersWithDecks.putIfAbsent(player, new LinkedHashSet<>());

            LinkedHashSet<String> cards = playersWithDecks.get(player);
            cards.addAll(Arrays.asList(hands));
            playersWithDecks.putIfAbsent(player, cards);

            input = scanner.nextLine();
        }

        playersWithDecks.forEach((key, value) -> {
            int totalPower = 0;
            for (String card : value) {
                int cur=multiplicatorCards(card);
                totalPower += cur;

            }
            System.out.printf("%s: %d%n", key, totalPower);
        });

    }

    public static int multiplicatorCards(String cards) {//2h
        int sum = 0;
        String currPower = cards.substring(0, cards.length() - 1);
        switch (currPower) {
            case "2":
                sum = 2;
                break;
            case "3":
                sum = 3;
                break;
            case "4":
                sum = 4;
                break;
            case "5":
                sum = 5;
                break;
            case "6":
                sum = 6;
                break;
            case "7":
                sum = 7;
                break;
            case "8":
                sum = 8;
                break;
            case "9":
                sum = 9;
                break;
            case "10":
                sum = 10;
                break;
            case "J":
                sum = 11;
                break;
            case "Q":
                sum = 12;
                break;
            case "K":
                sum = 13;
                break;
            case "A":
                sum = 14;
                break;

        }
        String multiplicator = cards.substring(cards.length() - 1);
        switch (multiplicator) {
            case "S":
                sum = sum * 4;
                break;
            case "H":
                sum = sum * 3;
                break;
            case "D":
                sum = sum * 2;
                break;
            case "C":

                break;
        }
        return sum;
    }
}




