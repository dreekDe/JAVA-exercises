package SetAndMapAdvanced;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, double[]> grades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] currGrades = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
            grades.putIfAbsent(name, new double[currGrades.length]);
            grades.put(name, currGrades);
        }

        for (Map.Entry<String, double[]> entry : grades.entrySet()) {
            double sum = 0.0;
            for (int i = 0; i < entry.getValue().length; i++) {
                sum += entry.getValue()[i];
            }
            double avv = sum / entry.getValue().length;
            System.out.printf("%s is graduated with "+ avv,entry.getKey());
            System.out.println();
        }

    }
}
