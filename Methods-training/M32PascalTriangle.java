import java.util.Scanner;

public class M32PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int [] arr = new int[n];

        for (int i = 1; i <= arr.length; i++) {
            arr[i] = i+1;
        }


    }
}


