package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputCommand = scanner.nextLine();

        ArrayDeque<String> filesToPrint = new ArrayDeque<>();

        while (!"print".equals(inputCommand)) {
            if ("cancel".equals(inputCommand)) {
                if (filesToPrint.size() == 0) {
                    System.out.println("Printer is on standby");
                }else{
                   // System.out.println("Canceled " + filesToPrint.poll());
                System.out.println("Canceled " + filesToPrint.pollFirst());
                  // System.out.println("Canceled " + filesToPrint.pollLast());
                }
            }else{
                filesToPrint.offer(inputCommand);
            }
            inputCommand = scanner.nextLine();
        }
        for (String input : filesToPrint) {
            System.out.println(input);
        }
    }
}
