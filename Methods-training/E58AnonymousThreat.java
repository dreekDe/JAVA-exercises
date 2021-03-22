import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E58AnonymousThreat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"3:1".equals(command)) {
            String[] tokens = command.split("\\s+");

            if ("merge".equals(tokens[0])) {
                int startIndex = Integer.parseInt(tokens[1]);
                startIndex = Math.max(startIndex, 0);
                if (startIndex >= data.size()) {
                    startIndex = data.size() - 1;
                }

                int endIndex = Integer.parseInt(tokens[2]);
                endIndex = Math.min(endIndex, data.size() - 1);

                String result = "";
                for (int i = startIndex; i <= endIndex; i++) {
                    result += data.get(startIndex);
                    data.remove(startIndex);
                }
                data.add(startIndex, result);
            } else {
                int index = Integer.parseInt(tokens[1]);
                int partitions = Integer.parseInt(tokens[2]);
                String element = data.get(index);
                data.remove(index);

                int size = element.length() / partitions;
                int begin = 0;
                //begin + size = end
                //substring - разделя стринга на чарове - с begin определяме първият чар, който трябва да вземем
                // а с end - дължиата от първият + размера на партишана - колко чара взимаме
                //с index ++ при всяка операция, указваме на да ни сложи подстринга на следващият индекс

                for (int i = 0; i < partitions - 1; i++) {
                    data.add(index++, element.substring(begin, begin+size));
                    //element.substring(begin, begin+size)) - кой елемент да раздели - от кой индекс да започне и колко чара да е подстринга
                    begin += size; // изменяме началният чар с размера на вече отделените чарове

                }
                data.add(index, element.substring(begin));
                //тук добавя ако след субстракцията има останали чарове в стартовият елемент
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(" ", data));
    }
}
