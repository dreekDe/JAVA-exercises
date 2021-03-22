package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String[] tokens = input.split("\\s+");
        ArrayDeque<String> names = new ArrayDeque<>();
        for (String elem : tokens) {
            names.offer(elem);
        }
        int count = 1;

        while (names.size() > 1) {

            for (int i = 0; i < n - 1; i++) {
                names.offer(names.poll());
            }
            if (count == 1) {
                System.out.printf("Removed %s%n", names.poll());
            } else {
                if (isPrime(count)) {
                    System.out.printf("Prime %s%n", names.peek());
                } else {
                    System.out.printf("Removed %s%n", names.poll());
                }
            }
            count++;
        }
        System.out.println("Last is " + names.poll());
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0)

                return false;
        }
        return true;

    }
}