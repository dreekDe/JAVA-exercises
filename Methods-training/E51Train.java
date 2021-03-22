import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E51Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int capacityOfWagon = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!"end".equals(command)) {

            String[] tokens = command.split("\\s+");

            if ("Add".equals(tokens[0])) {
                train.add(Integer.parseInt(tokens[1]));
            } else {
                int currentPassenger = Integer.parseInt(tokens[0]);
                for (int i = 0; i < train.size(); i++) {
                    if (capacityOfWagon >= (currentPassenger + train.get(i))) {
                        train.set(i, (currentPassenger + train.get(i)));
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));
    }
}
