package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        String[] numbers = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> stack = new ArrayDeque<>();


        int n = Integer.parseInt(tokens[0]);

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(numbers[i]);
            stack.push(currentNum);
        }

        n = Integer.parseInt(tokens[1]);
        for (int i = 0; i < n; i++) {
            stack.pop();
        }

        n = Integer.parseInt(tokens[2]);

        if (stack.contains(n)) {
            System.out.println("true");
        } else {
            if (stack.size()> 0) {
                int smallestElement = Integer.MAX_VALUE;
                for (Integer integer : stack) {
                    if (integer < smallestElement) {
                        smallestElement = integer;
                    }
                }
                System.out.println(smallestElement);
            }else{
                System.out.println("0");
            }
        }
    }
}

