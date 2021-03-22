import java.util.Random;
import java.util.Scanner;

public class testove {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split("\\s+");
        
        Random rand = new Random();


        for (int i = 0; i < input.length; i++) {
            int randomIndex = rand.nextInt(input.length);

            String temp = input[i];
            input[i] = input[randomIndex];
            input[randomIndex] = temp;


            for (String s : input) {
                System.out.println(input);
            }
        }
    }
    
}
