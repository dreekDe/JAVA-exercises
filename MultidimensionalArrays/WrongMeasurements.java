package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readArr(scanner, "\\s+");
        }

        int[] valueIndexes = readArr(scanner, "\\s+");

        int wrongValues = matrix[valueIndexes[0]][valueIndexes[1]];

        List<int[]> indexes = new ArrayList<>();
        List<Integer> correctValues = new ArrayList<>();

        getIndexesAndcorrectValue(matrix, wrongValues, indexes, correctValues);

        corectionWrongIndexes(matrix, indexes, correctValues);

        printTheOutpuMatrix(matrix);

    }

    private static void printTheOutpuMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    private static void corectionWrongIndexes(int[][] matrix, List<int[]> indexes, List<Integer> correctValues) {
        for (int i = 0; i < indexes.size(); i++) {
            int[] rowAndcol = indexes.get(i);
            matrix[rowAndcol[0]][rowAndcol[1]] = correctValues.get(i);
        }
    }

    private static void getIndexesAndcorrectValue(int[][] matrix, int wrongValues, List<int[]> indexes, List<Integer> correctValues) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (wrongValues == matrix[i][j]) {
                    indexes.add(new int[]{i, j});
                    correctValues.add(getCorrectValue(matrix, i, j));
                }
            }
        }
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
