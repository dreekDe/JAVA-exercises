import java.util.Scanner;

public class E25PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputStart = Integer.parseInt(scanner.nextLine());
        int inputEnd = Integer.parseInt(scanner.nextLine());

        for (int i = inputStart; i <=inputEnd ; i++) {
            System.out.printf("%c ",i);


        }

    }
}
