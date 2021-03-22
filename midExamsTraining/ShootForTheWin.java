import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        String command = scanner.nextLine();
        int count = 0;

        while (!"End".equals(command)) {
            int currentIndex = Integer.parseInt(command);

            if (currentIndex >= 0 && currentIndex <= array.length - 1) {
                count++;
                int temp = array[currentIndex];
                array[currentIndex] = -1;

                for (int i = 0; i < array.length; i++) {

                    if (temp < array[i] && array[i] != -1) {
                        array[i] -= temp;
                    } else if (temp >= array[i] && array[i] != -1) {
                        array[i] += temp;
                    }
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",count);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
