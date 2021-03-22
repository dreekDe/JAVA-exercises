import java.util.Scanner;

public class L12Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double studentGrade = Double.parseDouble(scanner.nextLine());

        if (studentGrade >= 3.0){
            System.out.println("Passed!");
        }
    }
}
