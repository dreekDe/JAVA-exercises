package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> historyForward = new ArrayDeque<>();

        String command = scanner.nextLine();
        String currentNavigation = "";

        while (!"Home".equals(command)) {
            if ("back".equals(command)) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    historyForward.push(currentNavigation);
                    currentNavigation = history.pop();
                }
            } else if ("forward".equals(command)) {
                if (historyForward.isEmpty()) {
                    System.out.println("no next URLs");
                    command = scanner.nextLine();
                    continue;
                } else {
                    history.push(currentNavigation);
                    currentNavigation = historyForward.pop();
                }
            } else {
                if (!currentNavigation.equals("")) {
                    history.push(currentNavigation);
                    if (!historyForward.isEmpty()){
                        historyForward.clear();
                    }
                }
                currentNavigation = command;
            }
            System.out.println(currentNavigation);
            command = scanner.nextLine();
        }
    }
}
