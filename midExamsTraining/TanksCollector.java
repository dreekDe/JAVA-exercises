import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TanksCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> tanks = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            int currIndex = 0;
            switch (tokens[0]) {
                case "Add":
                    if (tanks.contains(tokens[1])) {
                        System.out.println("Tank is already bought");
                    } else {
                        tanks.add(tokens[1]);
                        System.out.println("Tank successfully bought");
                    }
                    break;
                case "Insert":
                    currIndex = Integer.parseInt(tokens[1]);
                    if (currIndex >= 0 && currIndex < tanks.size()) {
                        if (tanks.contains(tokens[2])) {
                            System.out.println("Tank is already bought");
                        } else {
                            tanks.add(currIndex, tokens[2]);
                            System.out.println("Tank successfully bought");
                        }
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Remove":
                    if (tanks.contains(tokens[1])) {
                        tanks.remove(tokens[1]);
                        System.out.println("Tank successfully sold");
                    } else {
                        System.out.println("Tank not found");
                    }
                    break;
                case "Remove At":
                    currIndex = Integer.parseInt(tokens[1]);
                    if (currIndex >= 0 && currIndex < tanks.size()) {
                        tanks.remove(currIndex);
                        System.out.println("Tank successfully sold");
                    } else {
                        System.out.println("Index out of range");
                    }
            }
        }
        System.out.println(tanks.toString().replaceAll("[\\[\\]]", ""));
    }
}
