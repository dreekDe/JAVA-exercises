import java.util.Scanner;

public class E27WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // tank capaity =   255l
        // n lines will receive litres to pour our tank
        //capacity is not enough, print “Insufficient capacity!”and continue reading the next line.
        //On the last line, print the liters in the tank.

        int n = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;
        int pourInTheTank = 0;

        for (int i = 0; i < n; i++) {
            int litresForPourInTheTank = Integer.parseInt(scanner.nextLine());
            if (litresForPourInTheTank <= tankCapacity) {
                tankCapacity -= litresForPourInTheTank;
                pourInTheTank += litresForPourInTheTank;
            }else{
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(pourInTheTank);
    }
}
