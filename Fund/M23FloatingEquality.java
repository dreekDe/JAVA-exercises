import java.math.BigDecimal;
import java.util.Scanner;

public class M23FloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigDecimal a = new BigDecimal(scan.nextLine());
        BigDecimal b = new BigDecimal(scan.nextLine());

        BigDecimal result = a.subtract(b);
        double res = Math.abs(result.doubleValue());

       if (res >= 0.000001){
           System.out.println("False");
       }else{
           System.out.println("True");
       }
    }
}