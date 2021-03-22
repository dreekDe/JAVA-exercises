package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i <= n; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            String currentCommand = command[0];
            switch (currentCommand) {
                case "1":
                    int currentElement = Integer.parseInt(command[1]);
                    numbers.push(currentElement);
                    break;
                case "2":
                    numbers.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(numbers));
                    break;
            }
        }
    }
}
