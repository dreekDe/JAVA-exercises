import java.util.*;
import java.util.stream.Collectors;

public class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        double averageSum = (sum * 1.0 / numbers.size());
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) <= averageSum) {
                numbers.remove(i);
            }
        }

        if (numbers.size() < 1) {
            System.out.println("No");
        } else {
            Collections.sort(numbers);
            Collections.reverse(numbers);

            if (numbers.size() >= 5) {
                for (int i = 0; i < 5; i++) {
                    System.out.print(numbers.get(i) + " ");
                }
            } else {
                for (Integer number : numbers) {
                    System.out.print(number + " ");
                }
            }
        }
    }
}