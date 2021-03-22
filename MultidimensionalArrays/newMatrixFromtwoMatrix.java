package MultidimensionalArrays;

import java.util.Scanner;

public class newMatrixFromtwoMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = readMatrix(scanner, rows, columns);
        char[][] secondMatrix = readMatrix(scanner, rows, columns);

        char[][] outputMatrix = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                outputMatrix[i][j] =
                        firstMatrix[i][j] == secondMatrix[i][j]
                                ? firstMatrix[i][j]
                                : '*';
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <columns ; j++) {
                System.out.print(outputMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static char[][] readMatrix(Scanner scanner, int rows, int columns) {
        char[][] matrix = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            String[] symbols = scanner.nextLine().split("\\s+");
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = symbols[j].charAt(0);
            }
        }
        return matrix;
    }
}