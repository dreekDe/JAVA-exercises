package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayList<ArrayList<Integer>> field = new ArrayList<>();

        int count = 1;
        for (int i = 0; i < size[0]; i++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int j = 0; j < size[1]; j++) {
                numbers.add(count++);
            }
            field.add(numbers);
        }

        String command = scanner.nextLine();

        while (!"Nuke it from orbit".equals(command)) {
            int[] tokens = Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();

            int row = tokens[0];
            int col = tokens[1];
            int radius = tokens[2];


            for (int i = col - radius; i <= col + radius; i++) {
                if (row >= 0 && row < field.size() && i >= 0 && i < field.get(row).size()) {
                    field.get(row).set(i, -1);
                }
            }

            for (int i = row - radius; i <= row + radius; i++) {
                if (i >= 0 && i < field.size() && col >= 0 && col < field.get(i).size()) {
                    field.get(i).set(col, -1);
                }

                for (ArrayList<Integer> integers : field) {
                    negativeRemover(integers);
                }
            }
            field.removeIf(ArrayList::isEmpty);
            command = scanner.nextLine();
        }
        printMatrix(field);
    }

    public static void negativeRemover(ArrayList<Integer> currRow) {
        currRow.removeIf(e -> e == -1);
    }


    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (ArrayList<Integer> integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
