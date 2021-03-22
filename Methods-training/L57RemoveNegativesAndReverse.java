import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L57RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i = -1;
            }
        }
        if (numbers.size() == 0) {
            System.out.println("empty");
        }
        printRemoveNegativeNumbersByList(numbers);
    }

    private static void printRemoveNegativeNumbersByList(List<Integer> numbers) {
        for (int i = numbers.size()-1; i >=0 ; i--) {
            System.out.print(numbers.get(i)+ " ");
        }
    }
}
