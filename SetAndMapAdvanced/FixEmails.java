package SetAndMapAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = scanner.nextLine())) {
            String email = scanner.nextLine();
            String[] tokens = email.split("\\.");
            String currentEnd = tokens[1];
            if (!"us".equals(currentEnd) && !"com".equals(currentEnd) && !"uk".equals(currentEnd)) {

                emails.put(input, email);

            }

        }
        emails.forEach((key, value) -> {
            System.out.printf("%s -> %s%n", key, value);
        });


    }

}