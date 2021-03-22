import java.util.Scanner;

public class L110MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theInteger = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s X %d = %d%n",theInteger,i,theInteger*i);
        }
    }
}
