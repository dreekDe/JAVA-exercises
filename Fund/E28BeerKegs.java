import java.util.Scanner;

public class E28BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double volumeKegs = 0.0;
        String name = " ";

        for (int i = 0; i < n; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius,2) * height;

            if (volume > volumeKegs){
                volumeKegs = volume;
                name = model;
            }
        }
        System.out.println(name);
    }
}
