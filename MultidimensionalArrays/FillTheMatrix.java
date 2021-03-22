package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");


        int[][] matrix = new int[Integer.parseInt(tokens[0])][Integer.parseInt(tokens[0])];

        switch (tokens[1]) {

            case "A":
                int currentNum = 1;
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        matrix[j][i] = currentNum;
                        currentNum++;
                    }
                }

                break;
            case "B":
                currentNum = 1;
                for (int i = 0; i < matrix.length; i++) {
                    if (i % 2 == 0) {
                        for (int j = 0; j < matrix.length; j++) {
                            matrix[j][i] = currentNum;
                            currentNum++;
                        }
                    } else {
                        for (int j = matrix[i].length-1; j >= 0; j--) {
                            matrix[j][i] = currentNum;
                            currentNum++;
                        }
                    }

                }

                break;
        }
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
