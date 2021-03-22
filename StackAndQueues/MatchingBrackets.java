package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> indexes = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '(') {
                indexes.push(i);
            } else if (currentChar == ')') {
                int startIndex = indexes.pop();
                int endIndex = i + 1;

                String currentSubstring = input.substring(startIndex, endIndex);
                System.out.println(currentSubstring);
            }

        }
    }
}
