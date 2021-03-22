import java.util.Scanner;

public class L31DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        String[] daysOfWeek = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

            if (days >= 1 && days <= 7){
                System.out.println(daysOfWeek[days - 1]);
            }else{
                System.out.println("Invalid day!");
            }


    }
}
