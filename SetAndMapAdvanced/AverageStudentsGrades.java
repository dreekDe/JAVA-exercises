package SetAndMapAdvanced;

import java.util.*;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> grades = new TreeMap<>();


        for (int i = 0; i < countOfStudents; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String students = tokens[0];
            double currentGrade = Double.parseDouble(tokens[1]);
            grades.putIfAbsent(students, new ArrayList<>());
            grades.get(students).add(currentGrade);

        }

        for (Map.Entry<String, ArrayList<Double>> e : grades.entrySet()) {
            System.out.printf("%s -> ", e.getKey());

            for (Double v : e.getValue()) {
                System.out.printf("%.2f ", v);
            }

            double sum = 0.0;
            for (Double aDouble : e.getValue()) {
                sum += aDouble;
            }
            sum = sum / e.getValue().size();

            System.out.printf("(avg: %.2f)%n", sum);
        }

    }
}

