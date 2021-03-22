package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] diagonals = new int[n][n];

        for (int i = 0; i < n; i++) {
            diagonals[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(diagonals[i][i] + " ");
        }
        System.out.println();

        for (int j = 0; j < n; j++) {
            System.out.print(diagonals[(n - 1) - j][j] + " ");
        }
    }
}

