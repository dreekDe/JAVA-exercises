package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class areEqualsTwoMatricies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEquals = compareMatrices(firstMatrix, secondMatrix);

        System.out.println(areEquals ? "equal" : "not equal");

    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];

            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int column = 0; column < firstArr.length; column++) {

                if (firstArr[column] != secondArr[column]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;

        }
        return matrix;
    }
}
/* 4etene na masiw ot konzolata 2-ri variant

 String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);

        int [][] firstMatrix = new int[rows][columns];

 for (int j = 0; j < rows; j++) {
                String [] input = scanner.nextLine().split("\\s+");
                for (int k = 0; k < columns; k++) {
                    firstMatrix[j][k] = Integer.parseInt(input[k]);

                }
            }
              private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        //prowerqwame dali redovete s 2-tam asiva sa ednakwi
        // lenght e broq na masivite t.e. redowete
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        //ako sa ednakwi si wadim masiwite ot 2-te matrici
        // i sravnqwame broq na elementite vyv vseki masiv
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstArr = firstMatrix[row];
            int[] secondArr = secondMatrix[row];
            //sled kato sme izvadili syotvetnie redowe na 2-te matrici
            //proverqvame dali imat ednakyv broi elementi
            if (firstArr.length != secondArr.length) {
                return false;
            }
            //sled kato sme srawnili broq na elemenite na syotvetnite redove ot 2-te matrici i ako te sa ravni
            //sravnqvame wseki element o 2-te matrici dali sa ednakwi po poziciite
            for (int column = 0; column < firstArr.length; column++) {
                //ako elemneta na 1-viqt masiv ot 1-vata matrica e != ot elementa ot 1-viqt masiw na vtorata matrica
                if (firstArr[column] != secondArr[column]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int columns = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            matrix[i] = arr;

        }
        return matrix;
    }
 */