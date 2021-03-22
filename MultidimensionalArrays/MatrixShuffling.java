package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String[][] matrix = new String[tokens[0]][tokens[1]];

        for (int i = 0; i < tokens[0]; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[i] = arr;
        }

        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            try {
                String[] currenCommand = command.split("\\s+");

                if (!"swap".equals(currenCommand[0]) || currenCommand.length > 5) {
                    throw new IllegalStateException();
                }
                int firstRow = Integer.parseInt(currenCommand[1]);
                int firstCol = Integer.parseInt(currenCommand[2]);
                int secondRow = Integer.parseInt(currenCommand[3]);
                int secondCol = Integer.parseInt(currenCommand[4]);

                String curr = matrix[firstRow][firstCol];
                matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                matrix[secondRow][secondCol] = curr;

                printMatrix(matrix);

            } catch (IndexOutOfBoundsException | IllegalStateException ex) {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}