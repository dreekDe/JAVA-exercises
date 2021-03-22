package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = numbers;
        }
        int sumFirst = 0;
        int sumSecond = 0;

        for (int i = 0; i < n; i++) {
            sumFirst += matrix[i][i];
            sumSecond += matrix[(n-1)-i][i];


        }
        System.out.println(Math.abs(sumFirst-sumSecond));

    }
}

