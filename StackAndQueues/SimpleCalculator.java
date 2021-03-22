package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<String> numbers = new ArrayDeque<>();
        Collections.addAll(numbers,tokens);



        while (numbers.size() > 1) {

            int firstDigit = Integer.parseInt(numbers.pop());
            String operator = numbers.pop();
            int secondDigit = Integer.parseInt(numbers.pop());

            if ("+".equals(operator)) {
                numbers.push((firstDigit + secondDigit) + "");
            } else {
                numbers.push((firstDigit - secondDigit) + "");
            }
        }
        System.out.println(numbers.pop());
    }
}
