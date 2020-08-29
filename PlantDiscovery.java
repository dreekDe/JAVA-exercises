package exam09;

import java.util.*;
import java.util.stream.Collectors;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarity = new HashMap<>();
        Map<String, Double> plantRate = new HashMap<>();

        String currentPlant = "";
        for (int i = 0; i < n; i++) {
            String[] plantWithRarity = scanner.nextLine().split("<->");
            currentPlant = plantWithRarity[0];
            int currentRarity = Integer.parseInt(plantWithRarity[1]);

            plantRarity.putIfAbsent(currentPlant, 0);
            plantRate.putIfAbsent(currentPlant, 0.0);

            if (plantRarity.get(currentPlant) < currentRarity) {
                plantRarity.put(currentPlant, currentRarity);
            }
        }

        String input = scanner.nextLine();

        while (!"Exhibition".equals(input)) {
            String[] tokens = input.split(": ");
            String currentCommand = tokens[0];
            String[] kindAndRate = tokens[1].split(" - ");
            currentPlant = kindAndRate[0];

            if (!plantRarity.containsKey(currentPlant)) {
                System.out.println("error");
            } else {
                switch (currentCommand) {
                    case "Rate":
                        double rate = Double.parseDouble(kindAndRate[1]);
                        if (plantRate.get(currentPlant) == 0) {
                            plantRate.put(currentPlant, rate);
                        } else {
                            double newRate = (plantRate.get(currentPlant) + rate) / 2;
                            plantRate.put(currentPlant, newRate);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(kindAndRate[1]);
                        plantRarity.put(currentPlant, newRarity);
                        break;
                    case "Reset":
                        plantRate.put(currentPlant, 0.0);
                        break;
                    default:
                        System.out.println("error");
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantRarity
                .entrySet()
                .stream()
                .sorted((a, b) -> {
                    int result = b.getValue() - a.getValue();
                    if (result == 0) {
                        double res = (plantRate.get(b.getKey()) - plantRate.get(a.getKey()));
                        return (int) res;
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), plantRate.get(entry.getKey()));
                });

        List<Integer> item = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
    }

}
