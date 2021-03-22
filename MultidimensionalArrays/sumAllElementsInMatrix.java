package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumAllElementsInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumn = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        int[][] matrix = new int[rowsAndColumn[0]][rowsAndColumn[1]];

        int sum = 0;
        for (int j = 0; j < rowsAndColumn[0]; j++) {
            int[] array = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
            matrix[j] = array;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        System.out.println(rowsAndColumn[0]);
        System.out.println(rowsAndColumn[1]);
        System.out.println(sum);
    }
}
