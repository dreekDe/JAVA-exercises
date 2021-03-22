import java.util.Scanner;

public class M11SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        System.out.println(max);

        if (max == b && min == c || max == c && min == b) {
            System.out.println(a);
        }else if (max == a && min == c || max == c && min == a){
            System.out.println(b);
        }else if (max == a && min == b || max ==b && min == a){
            System.out.println(c);
        }

        System.out.println(min);
    }
}
