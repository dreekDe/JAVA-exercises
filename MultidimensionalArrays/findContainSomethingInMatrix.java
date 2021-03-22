package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class findContainSomethingInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);

        int digitToFind = Integer.parseInt(scanner.nextLine());

        boolean isTrue = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int currentNumber = matrix[i][j];
                if (digitToFind == currentNumber) {
                    System.out.println(i + " " + j);
                    isTrue = true;
                }
            }
        }

        if (!isTrue){
            System.out.println("not found");
        }

    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;

        }
        return matrix;
    }
}
