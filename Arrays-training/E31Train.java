import java.util.Scanner;

public class E31Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waggonCount = Integer.parseInt(scanner.nextLine());

        int[] train = new int[waggonCount];

        for (int i = 0; i < train.length; i++) {
            train[i] = Integer.parseInt(scanner.nextLine());

        }
        int sum = 0;
        for (int waggon : train) {
            sum += waggon;
            System.out.print(waggon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
