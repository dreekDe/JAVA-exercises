import java.util.Scanner;

public class E211Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowbolls = Integer.parseInt(scanner.nextLine());


        double highQualityBoll = 0;
        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 0; i < numberOfSnowbolls; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double currentBall =  Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (currentBall > highQualityBoll) {
                highQualityBoll =  currentBall;
                snow = snowballSnow;
                time=snowballTime;
                quality = snowballQuality;


            }
        }
        System.out.printf("%d : %d = %.0f (%d)",snow,time,highQualityBoll,quality);
    }
}
