import java.util.Arrays;
import java.util.Scanner;

public class M31EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] encrypt = new int[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int sum = 0;
            String table = "aoueiAOUEI";
            for (int j = 0; j < name.length(); j++) {
                char symbol = name.charAt(j);

                if (table.contains(symbol + "")) {
                    sum += symbol * name.length();
                } else {
                    sum += symbol / name.length();
                }
            }
            encrypt[i] = sum;
        }

        Arrays.sort(encrypt);

        for (int elements : encrypt) {
            System.out.println(elements);
        }

    }
}

