import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E54ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");

            switch (tokens[0]) {
                case "Add":
                    addNumberToLIst(inputList, tokens[1]);
                    break;
                case "Insert":
                    if (isValidIndex(inputList, tokens[2])) {
                        insertNumberToList(inputList, tokens[1], tokens[2]);
                    }
                    break;
                case "Remove":
                    if (isValidIndex(inputList, tokens[1])) {
                        removeNumberToList(inputList, tokens[1]);
                    }
                    break;
                case "Shift":
                    if ("left".equals(tokens[1])) {
                        shiftLeftTheNumbers(inputList, tokens[2]);
                    } else {
                        shiftRightTheNumbers(inputList, tokens[2]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        printTheList(inputList);
    }

    private static List<Integer> printTheList(List<Integer> list) {
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
        return list;
    }

    private static void shiftRightTheNumbers(List<Integer> list, String counter) {
        for (int i = Integer.parseInt(counter) - 1; i >= 0; i--) {
            int temp = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, temp);

        }
    }

    private static boolean isValidIndex(List<Integer> list, String token) {
        int index = Integer.parseInt(token);
        boolean isValid = false;
        if (index >= 0 && index <= list.size() - 1) {
            isValid = true;
        } else {
            System.out.println("Invalid index");
        }
        return isValid;
    }

    private static void shiftLeftTheNumbers(List<Integer> list, String counter) {
        int count = 0;
        for (int i = 0; i < Integer.parseInt(counter); i++) {
            int temp = list.get(i);
            list.remove(i);
            list.add(temp);
            i = -1;
            count++;
            if (count == Integer.parseInt(counter)) {
                break;
            }

        }
    }

    private static void removeNumberToList(List<Integer> list, String token) {
        int index = Integer.parseInt(token);
        list.remove(index);
    }

    private static void insertNumberToList(List<Integer> list, String token, String index) {
        int number = Integer.parseInt(token);
        int ind = Integer.parseInt(index);
        list.add(ind, number);
    }

    private static void addNumberToLIst(List<Integer> list, String token) {
        int number = Integer.parseInt(token);
        list.add(number);
    }
}
