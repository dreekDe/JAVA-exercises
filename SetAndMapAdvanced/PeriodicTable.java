package SetAndMapAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements = new TreeSet<>();

        while (n-- > 0) {

            elements.addAll(Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toSet()));
            //elements.addAll(Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList()));

        }
       // System.out.println(String.join(" ", elements));

        elements.forEach(e -> System.out.println(e + " "));
    }
}
