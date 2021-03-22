import java.util.Scanner;

public class E23Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int people = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        int courses = people / capacityOfElevator;
        if (people % capacityOfElevator !=0){
            courses +=1;
        }

        System.out.println(courses);

    }
}
