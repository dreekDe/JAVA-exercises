package MultidimensionalArrays;

import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rotationInput = scanner.nextLine().split("[()\\s+]");

        String input = scanner.nextLine();
        int maxValue = Integer.MIN_VALUE;
        StringBuilder sb = new StringBuilder();
        while (!"END".equals(input)) {
            sb.append(input);
            sb.append(" ");
            if (input.length() > maxValue) {
                maxValue = input.length();
            }
            input = scanner.nextLine();
        }


        String[] inputToTheMatrix = sb.toString().split(" ");

        String[][] matrix = readMatrix(maxValue, inputToTheMatrix);

        int x = Integer.parseInt(rotationInput[1]) % 360;

        if (x == 0) {
            printTheMatrix(matrix);
        } else if (x == 90) {
            String[][] newMatrix = rotateMatrix(maxValue, matrix);
            printTheReverseMatrix90(newMatrix);
        } else if (x == 180) {
            printTheReverseMatrix180(matrix);
        } else if (x == 270) {
            String[][] newMatrix = rotateMatrix(maxValue, matrix);
            printTheReverseMatrix270(newMatrix);
        }

    }

    private static String[][] readMatrix(int maxValue, String[] inputToTheMatrix) {
        String[][] matrix = new String[inputToTheMatrix.length][maxValue];

        for (int i = 0; i < inputToTheMatrix.length; i++) {
            String[] element = new String[maxValue];
            for (int k = 0; k < inputToTheMatrix[i].length(); k++) {
                element[k] = inputToTheMatrix[i].charAt(k) + "";
            }
            for (int j = inputToTheMatrix[i].length(); j < maxValue; j++) {
                char ch = 32;
                element[j] = ch + "";
            }
            matrix[i] = element;
        }
        return matrix;
    }

    private static String[][] rotateMatrix(int maxValue, String[][] matrix) {
        String[][] newMatrix = new String[maxValue][matrix.length];

        for (int j = 0; j < matrix.length; j++) {
            String[] curr = matrix[j];
            for (int k = curr.length - 1; k >= 0; k--) {
                newMatrix[k][j] = curr[k];
            }
        }
        return newMatrix;
    }

    public static void printTheReverseMatrix270(String[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printTheReverseMatrix180(String[][] matrix) {
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void printTheReverseMatrix90(String[][] matrix) {
        for (String[] strings : matrix) {
            for (int j = strings.length - 1; j >= 0; j--) {
                System.out.print(strings[j]);
            }
            System.out.println();
        }
    }

    public static void printTheMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();

        }
    }
}