package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class diagonalSecondWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] diagonals = new int[n][n];

        for (int i = 0; i < n; i++) {
            diagonals[i] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }

        int rows = 0;
        int col = 0;

        while (rows < n && col < n) {
            System.out.print(diagonals[rows][col] + " ");
            rows++;
            col++;
        }
        System.out.println();

        rows = n - 1;
        col = 0;

        while (rows >= 0 && col < n) {
            System.out.print(diagonals[rows][col] + " ");
            rows--;
            col++;
        }
        System.out.println();

        rows = n - 1;
        col = n - 1;

        while (rows >= 0 && col >= 0) {
            System.out.print(diagonals[rows][col] + " ");
            rows--;
            col--;
        }
        System.out.println();

        col = n - 1;
        rows = 0;

        while (col >= 0 && rows < n) {
            System.out.print(diagonals[rows][col] + " ");
            rows++;
            col--;
        }
    }

}
