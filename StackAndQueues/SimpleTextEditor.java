package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfOperation = Integer.parseInt(scanner.nextLine());
        String text = "";

        ArrayDeque<String> lastSubstring = new ArrayDeque<>();

        for (int i = 0; i < numberOfOperation; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            switch (tokens[0]) {
                case "1":
                    text += tokens[1];
                    lastSubstring.push(text);
                    break;
                case "2":
                    text = text.substring(0, text.length() - Integer.parseInt(tokens[1]));
                    lastSubstring.push(text);
                    break;
                case "3":
                    System.out.println(text.charAt(Integer.parseInt(tokens[1]) - 1));
                    break;
                case "4":
                    if (lastSubstring.size() > 1) {
                        lastSubstring.pop();
                        text = lastSubstring.peek();
                    } else {
                        text = "";
                    }
                    break;
            }
        }
    }
}
