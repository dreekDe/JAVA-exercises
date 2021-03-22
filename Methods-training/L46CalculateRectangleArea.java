import java.util.Scanner;

public class L46CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wight = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = getRectangleArea(wight, height);
        System.out.printf("%.0f",area);
    }

    private static double getRectangleArea(double wight, double height) {
        return wight * height;
    }
}
