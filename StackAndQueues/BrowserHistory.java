package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String command = scanner.nextLine();

        String currentNavigation = "";

        while (!"Home".equals(command)) {
            if ("back".equals(command)) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    currentNavigation=history.pop();
                }
            } else {
                if (!currentNavigation.isEmpty()){
                    history.push(currentNavigation);
                }
                currentNavigation = command;
            }

            System.out.println(currentNavigation);
            command = scanner.nextLine();
        }
    }
}

