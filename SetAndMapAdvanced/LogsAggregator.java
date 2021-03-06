package SetAndMapAdvanced;

import java.util.*;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, TreeMap<String, Integer>> namesAndIP = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[1];
            String IP = tokens[0];
            int count = Integer.parseInt(tokens[2]);

            namesAndIP.putIfAbsent(name, new TreeMap<>());
            namesAndIP.get(name).putIfAbsent(IP, 0);
            namesAndIP.get(name).put(IP, namesAndIP.get(name).get(IP) + count);

        }
        for (Map.Entry<String, TreeMap<String, Integer>> user : namesAndIP.entrySet()) {
            List<String> ips = new ArrayList<>();
            final int[] sum = {0};
            user.getValue().entrySet()
                    .stream()
                    .forEach(e -> {
                                ips.add(e.getKey());
                            sum[0] += e.getValue();
                    });
            System.out.printf("%s: %d ", user.getKey(), sum[0]);
            System.out.println(ips);


        }
    }
}
