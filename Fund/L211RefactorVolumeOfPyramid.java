import java.util.Scanner;

public class L211RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Length: ");
        double lenght = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        double hight = Double.parseDouble(scanner.nextLine());

        double volumeOfPyramid = (lenght * width * hight) / 3;

        System.out.printf("Pyramid Volume: %.2f",volumeOfPyramid);


    }
}
