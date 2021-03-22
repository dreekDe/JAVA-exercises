import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L53MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        List<String> firstList = addToListFromString(firstInput);
        List<String> secondList = addToListFromString(secondInput);

        int minSize = Math.min(firstList.size(), secondList.size());

        List<String> outputList = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            System.out.print(firstList.get(i) + " ");
            System.out.print(secondList.get(i) + " ");
        }

        printToList(firstList , minSize);
        printToList(secondList , minSize);
    }

    public static void printToList(List<String> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }


    private static List<String> addToListFromString(String input) {
        String[] arr = input.split("\\s+");
        List<String> list = new ArrayList<>();

        for (String element : arr) {
            list.add(element);
        }
        return list;
    }
}
