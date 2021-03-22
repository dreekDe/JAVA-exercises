package SetAndMapAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Set<String> vips = new TreeSet<>();
        Set<String> regulars = new TreeSet<>();

        while (!"PARTY".equals(input)) {

            if (Character.isDigit(input.charAt(0))) {
                vips.add(input);
            } else {
                regulars.add(input);
            }
            input = scanner.nextLine();
        }

        TreeSet<String> allGuest = new TreeSet<>();
        allGuest.addAll(vips);
        allGuest.addAll(regulars);

        input = scanner.nextLine();

        while (!"END".equals(input)) {
            allGuest.remove(input);

            input = scanner.nextLine();

        }
        System.out.println(allGuest.size());
        System.out.println(String.join(System.lineSeparator(), allGuest));

    }
}
