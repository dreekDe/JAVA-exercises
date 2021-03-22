package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOfTwoSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[arr[0]][arr[1]];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        int sum = Integer.MIN_VALUE;
        int[][] bestMatrix = new int[2][2];

        for (int i = 0; i < arr[0]-1; i++) {
            for (int j = 0; j < arr[1]-1; j++) {
                int currSum = matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1];
                if (currSum > sum) {
                    sum = currSum;
                    bestMatrix[0][0] = matrix[i][j];
                    bestMatrix[0][1] = matrix[i][j + 1];
                    bestMatrix[1][0] = matrix[i + 1][j];
                    bestMatrix[1][1] = matrix[i + 1][j + 1];
                }
            }
        }
        for (int j = 0; j < bestMatrix.length; j++) {
            for (int k = 0; k < bestMatrix.length; k++) {
                System.out.print(bestMatrix[j][k] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}

