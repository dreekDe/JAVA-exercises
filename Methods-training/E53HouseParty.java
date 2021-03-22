import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E53HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> partyList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+", 3);
            if ("going!".equals(tokens[2])) {
                addTheNameByList(partyList, tokens[0]);
            } else {
                removeTheNameByList(partyList, tokens[0]);
            }
        }

        for (String name : partyList) {
            System.out.println(name + " ");
        }

    }

    private static List<String> removeTheNameByList(List<String> list, String token) {
        if (list.contains(token)) {
            list.remove(token);
        } else {
            System.out.printf("%s is not in the list!%n", token);
        }
        return list;
    }

    private static List<String> addTheNameByList(List<String> list, String token) {
        if (list.contains(token)) {
            System.out.printf("%s is already in the list!%n", token);
        } else {
            list.add(token);
        }
        return list;
    }
}