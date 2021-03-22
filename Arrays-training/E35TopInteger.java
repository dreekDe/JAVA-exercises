import java.util.Scanner;

public class E35TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNum = numbers[i];

            boolean isBiggestNum = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNum <= numbers[j]) {
                    isBiggestNum = false;
                    break;
                }
            }
            if (isBiggestNum){
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(numbers[numbers.length-1]);
    }
}