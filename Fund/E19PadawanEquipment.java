import java.util.Scanner;

public class E19PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfSingleLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfSingleRobes = Double.parseDouble(scanner.nextLine());
        double priceOfSingleBelsts = Double.parseDouble(scanner.nextLine());

        double countOfBelstFree =countOfStudents / 6;

        double totalPrice = (countOfStudents * priceOfSingleRobes) +
                (Math.ceil(countOfStudents * 1.1) * priceOfSingleLightsabers) +
                ((countOfStudents - countOfBelstFree) * priceOfSingleBelsts);

        if (amountOfMoney >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else{
            System.out.printf("Ivan Cho will need %.2flv more.",totalPrice - amountOfMoney);
        }

    }
}
