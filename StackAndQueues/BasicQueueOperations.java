package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::new).toArray();
        int[] inputNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::new).toArray();

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < tokens[0]; i++) {
            numbers.offer(inputNumbers[i]);
        }
        for (int i = 0; i < tokens[1]; i++) {
            numbers.poll();
        }
        if (numbers.size() > 0) {
            if (numbers.contains(tokens[2])) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(numbers));
            }
        } else {
            System.out.println("0");
        }
    }
}
