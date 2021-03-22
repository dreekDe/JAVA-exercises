import java.util.Scanner;

public class L43PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            printTriangleFromDigits(1, i);
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            printTriangleFromDigits(1, i);
            System.out.println();
        }

    }

    static void printTriangleFromDigits(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
    }
}




