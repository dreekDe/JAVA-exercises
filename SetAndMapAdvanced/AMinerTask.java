package SetAndMapAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourse = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = scanner.nextLine())) {

            resourse.putIfAbsent(input,0);
            int quantity = Integer.parseInt(scanner.nextLine());
            resourse.put(input, resourse.get(input)+quantity);
        }

        resourse.forEach((key, value) -> {
            System.out.printf("%s -> %d%n", key, value);
        });

        }
    }

