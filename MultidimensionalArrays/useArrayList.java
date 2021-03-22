package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class useArrayList {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matrix = readMatrix(scanner);

            int digitToFind = Integer.parseInt(scanner.nextLine());

            ArrayList<int[]> indexes = new ArrayList<>();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int currentNumber = matrix[i][j];
                    if (digitToFind == currentNumber) {
                        indexes.add(new int[]{i,j});
                    }
                }
            }

            if (indexes.isEmpty()){
                System.out.println("not found");
            }else {
                for (int[] index : indexes) {
                    System.out.println(index[0] + " " + index[1]);
                }
            }
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


