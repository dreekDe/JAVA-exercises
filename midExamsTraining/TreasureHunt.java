
import java.util.*;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();
        int index = 0;
        while (!"Yohoho!".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        if (!treasureChest.contains(tokens[i])) {
                            treasureChest.add(0, tokens[i]);
                        }
                    }
                    break;
                case "Drop":
                    index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < treasureChest.size()) {
                        String temp = treasureChest.get(index);
                        treasureChest.remove(index);
                        treasureChest.add(temp);
                    }
                    break;
                case "Steal":
                    index = treasureChest.size() - Integer.parseInt(tokens[1]);
                    if (index < 0) {
                        index = 0;
                    }
                    List<String> stolen = new ArrayList<>();
                    for (int i = treasureChest.size()-1; i >=index; i--) {
                        stolen.add(treasureChest.get(i));
                        treasureChest.remove(i);
                    }
                    Collections.reverse(stolen);
                    System.out.println(String.join(", ", stolen));
                    break;

            }
            command = scanner.nextLine();
        }
        if (treasureChest.size()==0){
            System.out.println("Failed treasure hunt.");
        }else{
            double sum = 0.0;
            for (String s : treasureChest) {
                sum+= s.length();
            }
            double result = sum / treasureChest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.",result);
        }
    }

}