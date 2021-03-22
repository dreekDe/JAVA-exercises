import java.util.Scanner;

public class L111MultiplicationTableTwoVariant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int theInteger = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10){
            System.out.printf("%s X %d = %d%n",theInteger,times,theInteger*times);
        }else{
            for (int i = times; i <=10 ; i++) {
                System.out.printf("%s X %d = %d%n",theInteger,i,theInteger*i);
            }
        }

    }
}
