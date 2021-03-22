import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Weaponsmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> weapon = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"Done".equals(command)) {
            String[] tokens = command.split("\\s+");

            int index = 0;

            switch (tokens[0]) {
                case "Move":
                    index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < weapon.size()) {
                        if ("Left".equals(tokens[1])) {
                            if (index - 1 >= 0) {
                                weapon.add(index - 1, weapon.get(index));
                                weapon.remove(index + 1);
                            }
                        } else {
                            if (index + 1 < weapon.size()) {
                                String temp = weapon.get(index);
                                weapon.remove(index);
                                weapon.add(index + 1, temp);

                            }
                        }
                    }
                    break;
                case "Check":
                    if ("Even".equals(tokens[1])) {
                        for (int i = 0; i < weapon.size(); i++) {
                            if (i % 2 == 0) {
                                System.out.print(weapon.get(i) + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int i = 0; i < weapon.size(); i++) {
                            if (i % 2 != 0) {
                                System.out.print(weapon.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        String nameOfWeapon = "You crafted ";
        for (String s : weapon) {
            nameOfWeapon += s;
        }
        System.out.print(nameOfWeapon + "!");
    }
}
