package SetAndMapAdvanced;

import java.util.*;
import java.util.stream.Collectors;

public class VoinaNumbersGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)//intstream
                .boxed()//hvani mi primitivniq potok i go pravi na stream ot Integer
                .collect(Collectors.toCollection(LinkedHashSet::new));

        Set<Integer> second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)//streama e Integer
                .collect(Collectors.toCollection(LinkedHashSet::new));


        int round = 50;
        while (round-- > 0) {

            Integer firstCard = first.iterator().next();//vry6ta element, no ne go premahva
            first.remove(firstCard);
            Integer secondCard = second.iterator().next();
            second.remove(secondCard);

            if (firstCard > secondCard) {
                first.add(firstCard);
                first.add(secondCard);
            } else if (secondCard > firstCard) {
                second.add(firstCard);
                second.add(secondCard);
            }

            if (first.isEmpty() || second.isEmpty()) {
                break;
            }
        }
        int fs = first.size();
        int ss = second.size();

        if (first.size() > second.size()) {
            System.out.println("First player win!");
        } else if (second.size() > first.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
