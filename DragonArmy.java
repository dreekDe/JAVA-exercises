import java.util.*;

public class DragonArmy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, TreeMap<String, List<Integer>>> kindNameDamageHealthArmor = new LinkedHashMap<>();

        int defaultHealth = 250;
        int defaultDamage = 45;
        int defaultArmor = 10;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String currType = tokens[0];
            String currName = tokens[1];

            kindNameDamageHealthArmor.putIfAbsent(currType, new TreeMap<>());
            kindNameDamageHealthArmor.get(currType).putIfAbsent(currName, new ArrayList<>());

            int currDamage = 0;
            int currHealth = 0;
            int currArmor = 0;
            if ("null".equals(tokens[2])) {
                currDamage = defaultDamage;
            } else {
                currDamage = Integer.parseInt(tokens[2]);
            }
            if ("null".equals(tokens[3])) {
                currHealth = defaultHealth;
            } else {
                currHealth = Integer.parseInt(tokens[3]);
            }
            if ("null".equals(tokens[4])) {
                currArmor = defaultArmor;
            } else {
                currArmor = Integer.parseInt(tokens[4]);
            }

            if (kindNameDamageHealthArmor.get(currType).get(currName).size() == 0) {
                kindNameDamageHealthArmor.get(currType).get(currName).add(currDamage);
                kindNameDamageHealthArmor.get(currType).get(currName).add(currHealth);
                kindNameDamageHealthArmor.get(currType).get(currName).add(currArmor);
            } else {
                while (kindNameDamageHealthArmor.get(currType).get(currName).size() > 0) {
                    kindNameDamageHealthArmor.get(currType).get(currName).remove(0);
                }
                kindNameDamageHealthArmor.get(currType).get(currName).add(currDamage);
                kindNameDamageHealthArmor.get(currType).get(currName).add(currHealth);
                kindNameDamageHealthArmor.get(currType).get(currName).add(currArmor);
            }

        }

        kindNameDamageHealthArmor
                .entrySet()
                .stream()
                .forEach(entry -> {
                    double sumDamage = 0.0;
                    double sumHealth = 0.0;
                    double sumArmor = 0.0;
                    for (Map.Entry<String, List<Integer>> type : entry.getValue().entrySet()) {

                        sumDamage += type.getValue().get(0);
                        sumHealth += type.getValue().get(1);
                        sumArmor += type.getValue().get(2);
                    }
                    double avvDamage = (sumDamage * 1.0) / entry.getValue().size();
                    double avvHealth = (sumHealth * 1.0) / entry.getValue().size();
                    double avvArmor = (sumArmor * 1.0) / entry.getValue().size();
                    System.out.printf("%s::(%.2f/%.2f/%.2f)%n", entry.getKey(), avvDamage, avvHealth, avvArmor);

                    entry.getValue()
                            .entrySet()
                            .forEach(entry1 -> {
                                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                                        entry1.getKey(), entry1.getValue().get(0), entry1.getValue().get(1), entry1.getValue().get(2));
                            });


                });


    }
}
