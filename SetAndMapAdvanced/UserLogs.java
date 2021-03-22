package SetAndMapAdvanced;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, LinkedHashMap<String, Integer>> usersIPCountOfMessage = new TreeMap<>();

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] tokens = command.split("\\s+");
            String[] currUser = tokens[2].split("=");
            String user = currUser[1];
            String[] currIP = tokens[0].split("=");
            String IP = currIP[1];

            usersIPCountOfMessage.putIfAbsent(user, new LinkedHashMap<>());
            usersIPCountOfMessage.get(user).putIfAbsent(IP, 0);
            usersIPCountOfMessage.get(user).put(IP, usersIPCountOfMessage.get(user).get(IP) + 1);

            command = scanner.nextLine();
        }

        usersIPCountOfMessage.entrySet()
                .stream()
                .forEach(e -> {
                    System.out.printf("%s: %n", e.getKey());
                    List<String> output = new ArrayList<>();
                    e.getValue().entrySet()
                            .stream()
                            .forEach(e1 -> {
                                output.add(e1.getKey()+" => " +e1.getValue());
                            });
                    System.out.println(output.toString().replaceAll("[\\[\\]]","") + ".");
                });


    }
}