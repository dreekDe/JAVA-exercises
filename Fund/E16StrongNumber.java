import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;

public class E16StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSum = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt("" + input.charAt(i));
            int currentSum = 1;
            for (int j = digit; j >= 1; j--) {
                currentSum *= j;
            }
            totalSum+=currentSum;
        }
        int number = Integer.parseInt(input);
        if (number == totalSum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
