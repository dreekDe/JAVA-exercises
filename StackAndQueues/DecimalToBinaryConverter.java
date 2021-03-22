package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());
        if (input == 0) {
            System.out.println("0");
        } else {
            ArrayDeque<Integer> binary = new ArrayDeque<>();

            while (input != 0) {
                binary.push(input % 2);
                input = input / 2;
            }
            System.out.println(binary.toString().replaceAll("[\\[\\],\\s+]", ""));
        }
    }
}
