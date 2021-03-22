package SetAndMapAdvanced;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SerbianUnleashed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lepa Brena @Sunny Beach 25 3500
        //. Обобщете данните по място и по певец.
        //За всяко място отпечатайте певицата и общата сума пари, направени от неговите / нейните концерти, на отделен ред.
        //Местата трябва да се съхраняват в същия ред,
        // певците трябва да бъдат сортирани по това колко пари са спечелили в низходящ ред.
        // Ако двама певци са направили една и съща сума пари, запазете ги в реда, в който са били въведени.


        String regex = "(?<name>.+ ){1,3}@(?<city>\\w+[^0-9]+ ){1,3}(?<price>\\d+) (?<count>\\d+)";

        Pattern pattern = Pattern.compile(regex);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> citiesSingerTotal = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String city = matcher.group("city");
                String singer = matcher.group("name");
                int price = Integer.parseInt(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));
                int total = count * price;

                citiesSingerTotal.putIfAbsent(city, new LinkedHashMap<>());
                citiesSingerTotal.get(city).putIfAbsent(singer, 0);
                citiesSingerTotal.get(city).put(singer, citiesSingerTotal.get(city).get(singer) + total);
            }
            input = scanner.nextLine();
        }

        citiesSingerTotal.entrySet()
                .stream()
                .forEach(e->{
                    System.out.println(e.getKey());
                    e.getValue()
                            .entrySet()
                            .stream()
                            .sorted((a,b)->{
                               int resul=  b.getValue().compareTo(a.getValue());
                               return resul;
                            })
                    .forEach(entry ->
                            System.out.printf("#  %s-> %d%n",entry.getKey(),entry.getValue()));

                        });

    }
}
