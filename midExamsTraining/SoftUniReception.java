import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployLimit = Integer.parseInt(scanner.nextLine());
        int secondEmployLimit = Integer.parseInt(scanner.nextLine());
        int thirdEmployLimit = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int allEmploysPerHour = firstEmployLimit + secondEmployLimit + thirdEmployLimit;

        int countHour = 0;
        boolean flag = false;

        while (studentsCount > 0) {

            for (int i = 0; i < 3; i++) {
                studentsCount-=allEmploysPerHour;
                countHour++;
                if (studentsCount<= 0){
                    flag = true;
                    break;
                }
            }

            if (flag){
                break;
            }else{
                countHour++;
            }
        }
        System.out.printf("Time needed: %dh.",countHour);
    }
}