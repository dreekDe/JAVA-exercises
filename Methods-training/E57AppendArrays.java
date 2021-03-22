import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E57AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrays = scanner.nextLine().split("\\|");


        List<String> list = new ArrayList<>();

        for (int i = arrays.length-1; i >=0 ; i--) {
           String[]arr = arrays[i].split("\\s+");
            for (String element : arr) {
                if (!"".equals(element)) {

                    list.add(element);
                }
            }
        }
        System.out.println(String.join(" ",list));
    }
}
