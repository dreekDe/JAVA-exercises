package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = sizes[0];
        int cols = sizes[1];


        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }

        int[][] bestMatrix = new int[3][3];

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int currSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]
                        + matrix[i + 1][j] + matrix[i + 1][j + 1] + matrix[i + 1][j + 2]
                        + matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                if (maxSum < currSum) {
                    maxSum = currSum;

                    bestMatrix[0][0] = matrix[i][j];
                    bestMatrix[0][1] = matrix[i][j + 1];
                    bestMatrix[0][2] = matrix[i][j + 2];
                    bestMatrix[1][0] = matrix[i + 1][j];
                    bestMatrix[1][1] = matrix[i + 1][j + 1];
                    bestMatrix[1][2] = matrix[i + 1][j + 2];
                    bestMatrix[2][0] = matrix[i + 2][j];
                    bestMatrix[2][1] = matrix[i + 2][j + 1];
                    bestMatrix[2][2] = matrix[i + 2][j + 2];


                }
            }
        }

        System.out.printf("Sum = %d%n", maxSum);

        for (int i = 0; i < bestMatrix.length; i++) {
            for (int j = 0; j < bestMatrix.length; j++) {
                System.out.print(bestMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}