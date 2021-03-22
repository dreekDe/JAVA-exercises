import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfThePlumber = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double allPlunder = 0.0;
        for (int i = 1; i <= daysOfThePlumber; i++) {

            if (i % 3 == 0) {
                allPlunder += dailyPlunder * 1.5;
            } else {
                allPlunder += dailyPlunder;
            }
            if (i % 5 == 0) {
                allPlunder = allPlunder * 0.7;
            }
        }
        if (allPlunder>= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.",allPlunder);
        }else{
           double collectedPersentage = (allPlunder/expectedPlunder)*100;
            System.out.printf("Collected only %.2f%% of the plunder.",collectedPersentage);
        }
    }
}