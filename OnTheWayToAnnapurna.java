import java.util.*;
import java.util.stream.Collectors;

public class OnTheWayToAnnapurna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> stores = new HashMap<>();

        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String[] tokens = command.split("->");
            String currCommand = tokens[0];
            String currStore = tokens[1];

            switch (currCommand) {
                case "Add":
                    stores.putIfAbsent(currStore, new ArrayList<>());

                    List<String> items = Arrays.stream(tokens[2].split(",")).collect(Collectors.toList());

                    for (String item : items) {
                        stores.get(currStore).add(item);
                    }
                    break;
                case "Remove":
                    stores.remove(currStore);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Stores list:");
        stores
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = Integer.compare(b.getValue().size(), a.getValue().size());
                    if (result == 0) {
                        result = b.getKey().compareTo(a.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.println(entry.getKey());
                    for (String e:entry.getValue()) {
                        System.out.printf("<<%s>>%n",e);

                    }
                });

    }
}
