package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class methods {
    public static void main(String[] args) {




    }

    public static int[][] readMatrix(Scanner scanner, String separator) {
        String[] tokens = scanner.nextLine().split(separator);

        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int[] arr = readArr(scanner,separator);

            matrix[i] = arr;

        }
        return matrix;
    }

    public static int getCorrectValue(int[][] matrix, int row, int column) {
        int sum = 0;
        int wrongValue = matrix[row][column];
        if (isBound(matrix, row - 1, column) && wrongValue != matrix[row - 1][column]) {
            sum += matrix[row - 1][column];
        }
        if (isBound(matrix, row + 1, column) && wrongValue != matrix[row + 1][column]) {
            sum += matrix[row + 1][column];
        }
        if (isBound(matrix, row, column - 1) && wrongValue != matrix[row][column - 1]) {
            sum += matrix[row][column - 1];
        }
        if (isBound(matrix, row, column + 1) && wrongValue != matrix[row][column + 1]) {
            sum += matrix[row][column + 1];
        }
        return sum;
    }

    private static boolean isBound(int[][] matrix, int row, int column) {
        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[row].length;
    }

    private static boolean isOutOfBound(int[][] matrix, int row, int column) {
        return !isBound(matrix, row, column);
    }

    public static int[] readArr(Scanner scanner, String separator) {
        return Arrays.stream(scanner.nextLine().split(separator))
                .mapToInt(Integer::parseInt).toArray();
    }

}
