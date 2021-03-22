package SetAndMapAdvanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class PopulationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, Long>> countryCitiesPopulation = new LinkedHashMap<>();

        LinkedHashMap<String, Long> totalCounter = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"report".equals(input)) {
            String[] tokens = input.split("\\|");

            String country = tokens[1];
            String city = tokens[0];
            long population = Long.parseLong(tokens[2]);
            countryCitiesPopulation.putIfAbsent(country, new LinkedHashMap<>());
            countryCitiesPopulation.get(country).put(city, population);
            totalCounter.putIfAbsent(country, 0L);
            totalCounter.put(country, totalCounter.get(country) + population);

            input = scanner.nextLine();

        }
        countryCitiesPopulation.entrySet()
                .stream()
                .sorted((a, b) ->
                        totalCounter.get(b.getKey()).compareTo(totalCounter.get(a.getKey())))
                .forEach(e -> {
                    System.out.printf("%s (total population: %d)%n", e.getKey(), totalCounter.get(e.getKey()));
                    e.getValue().entrySet()
                            .stream()
                            .sorted((a, b) -> b.getValue().compareTo (a.getValue()))
                            .forEach(entry -> {
                                System.out.printf("=>%s: %d%n",entry.getKey(),entry.getValue());
                            });
                });

    }
}


