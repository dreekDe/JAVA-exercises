package StackAndQueues;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] memoryCountFibonacci;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memoryCountFibonacci = new long [n + 1];
        System.out.println(getFibonacci(n));

    }

    public static long getFibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memoryCountFibonacci[n] != 0) {
            return memoryCountFibonacci[n];
        }
        return memoryCountFibonacci[n] = getFibonacci(n - 1) + getFibonacci(n - 2);
        //при п=6, прескача 1-вият иф, след това проверява имаме ли записано нещо в паметта, ако нямаме отиваме
        // да търсим п5, ако нямаме изчислено отиваме да търсим как се изчислява и да видим дали имаме н4 ако нямаме н4 търсим н3 и така докато стигнем до 1
        // и 0 които се ретърнвт като 1. след това се връща на н3 и прави сбора като записва това което сме намерили и така до 6
    }

}
