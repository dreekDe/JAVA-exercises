import java.util.Scanner;


public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(",\\s+");

        String command = scanner.nextLine();

        int blocked = 0;
        int lost = 0;
        while (!"Report".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Blacklist":
                    boolean isFound = isFound(names, tokens[1]);
                    if (isFound) {
                        blocked++;
                        System.out.printf("%s was blacklisted.%n", tokens[1]);
                    } else {
                        System.out.printf("%s was not found.%n", tokens[1]);
                    }
                    break;
                case "Error":
                    lost = getLost(names, lost, tokens[1]);
                    break;
                case "Change":
                    getChange(names, tokens);
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d %n",blocked);
        System.out.printf("Lost names: %d %n",lost);
        System.out.println(String.join(" ",names));
    }

    private static void getChange(String[] names, String[] tokens) {
        int currIndex = Integer.parseInt(tokens[1]);
        if (currIndex>= 0 && currIndex< names.length){
            System.out.printf("%s changed his username to %s. %n",names[currIndex],tokens[2]);
            names[currIndex] = tokens[2];
        }
    }

    private static int getLost(String[] names, int lost, String token) {
        int currIndex = Integer.parseInt(token);
        if (!names[currIndex].equals("Blacklisted") && (!names[currIndex].equals("Lost"))) {
            lost++;
            System.out.printf("%s was lost due to an error.%n",names[currIndex]);
            names[currIndex] = "Lost";
        }
        return lost;
    }

    private static boolean isFound(String[] names, String token) {
        boolean isFound = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(token)) {
                names[i] = "Blacklisted";
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
