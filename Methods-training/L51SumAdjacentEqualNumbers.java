import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L51SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = getDoublesFromStringMassive(scanner);

        sumOfDoubleNumbers(numbers);

        printResult(numbers);
    }

    private static void printResult(List<Double> numbers) {
        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }

    private static void sumOfDoubleNumbers(List<Double> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }
    }

    private static List<Double> getDoublesFromStringMassive(Scanner scanner) {
        String[] input = scanner.nextLine().split("\\s+");

        List<Double> numbers = new ArrayList<>();

        for (String element : input) {
            double number = Double.parseDouble(element);
            numbers.add(number);
        }
        return numbers;
    }
}
