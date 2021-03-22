package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[rows][cols];

        readMatrix(scanner, rows, matrix);

        StringBuilder sb = new StringBuilder();

        int row = matrix.length - 1;
        int col = matrix[row].length - 1;

        StringBuilder result = new StringBuilder();

        while (col >= 0) {
            result.append(matrix[row][col]).append(" ");

            int upperRow = row - 1;
            int upperAndRightCol = col + 1;
            while (upperRow >= 0 && upperAndRightCol < matrix[upperRow].length) {
                result.append(matrix[upperRow][upperAndRightCol]).append(" ");
                upperRow--;
                upperAndRightCol++;
            }
            col--;
            result.append("\n");
        }

        row -= 1;
        col = 0;

        while (row >= 0) {
            result.append(matrix[row][col]).append(" ");

            int upperRow = row - 1;
            int upperAndRightCol = col + 1;

            while (upperRow >= 0 && upperAndRightCol < matrix[upperRow].length) {
                result.append(matrix[upperRow][upperAndRightCol]).append(" ");
                upperRow--;
                upperAndRightCol++;
            }
            row--;
            result.append("\n");
        }

        System.out.print(result);
    }
    private static void readMatrix(Scanner scanner, int row, int[][] matrix) {
        for (int i = 0; i < row; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
    }
}



