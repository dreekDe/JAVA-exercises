package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> plants = new ArrayDeque<>(0);

        String[] arr = scanner.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            plants.offer(Integer.parseInt(arr[i]));
        }


        int countDays = 1;
        int povDay = 1;
        while (countDays == povDay) {
            int size = plants.size();
            int currentNumb = plants.peek();
            plants.offer(plants.poll());
            for (int i = 0; i < size; i++) {
                int questElement = plants.poll();
                if (questElement > currentNumb) {
                    plants.poll();
                } else {
                    currentNumb = plants.peek();
                    plants.offer(questElement);
                }
            }
            if (plants.size()<size){
                povDay++;
            }
            countDays++;
        }

        System.out.println(countDays);
    }
}
