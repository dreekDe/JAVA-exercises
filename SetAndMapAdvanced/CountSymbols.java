package SetAndMapAdvanced;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        TreeMap<Character, Integer> table = new TreeMap<>((f, s) -> f - s);

        for (char symbol : input.toCharArray()) {
            table.putIfAbsent(symbol, 0);
            table.put(symbol, table.get(symbol) + 1);
        }

        System.out.println(table.entrySet()
                .stream()
                .map(e -> String.format("%c: %d time/s", e.getKey(), e.getValue()))
                .collect(Collectors.joining(System.lineSeparator())));

    }
}
