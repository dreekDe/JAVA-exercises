package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            numbers.push(Integer.parseInt(input[i]));
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(numbers.pop()+" ");
        }

    }
}
