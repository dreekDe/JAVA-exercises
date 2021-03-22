package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[tokens[0]][tokens[1]];
        int a = 97;

        for (int row = 0; row < tokens[0]; row++) {
            int x = 97 + row;
            for (int col = 0; col < tokens[1]; col++) {
                String curent = "";
                for (int i = 0; i < 3; i++) {
                    if (i % 2 != 0) {
                        curent = curent + (char) x + "";
                        x++;
                    } else {
                        curent = curent + (char) a + "";
                    }
                }
                matrix[row][col] = curent;
            }
            a++;
        }


        printTheMatrix(matrix);


    }

    private static void printTheMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}