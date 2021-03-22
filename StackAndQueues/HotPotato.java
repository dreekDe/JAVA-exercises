package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String [] tokens = input.split("\\s+");
        ArrayDeque <String> names = new ArrayDeque<>();
        for (String elem :tokens) {
            names.offer(elem);
        }
        while (names.size() > 1){
            for (int i = 0; i < n-1; i++) {
                names.offer(names.poll());
            }
            System.out.println("Removed " + names.poll());
        }
        System.out.println("Last is " + names.poll());
    }
}
