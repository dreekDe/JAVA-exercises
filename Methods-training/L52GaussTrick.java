import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L52GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (String element : input) {
            numbers.add(Integer.parseInt(element));
        }

        for (int i = 0; i < numbers.size() / 2; i++) {
            System.out.print(numbers.get(i) + numbers.get(numbers.size() - i - 1)+ " ");
        }

        if (numbers.size() % 2 == 1) {
            System.out.print(numbers.get(numbers.size() /2));
        }
    }
}
