import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> booksOnTheShelf = Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!"Done".equals(command)) {
            String[] tokens = command.split(" \\| ");

            if ("Add Book".equals(tokens[0]) && !booksOnTheShelf.contains(tokens[1])) {
                    booksOnTheShelf.add(0, tokens[1]);
            } else if ("Take Book".equals(tokens[0])) {
                booksOnTheShelf.remove(tokens[1]);
            } else if ("Swap Books".equals(tokens[0])) {
                if (booksOnTheShelf.contains(tokens[1]) && booksOnTheShelf.contains(tokens[2])) {
                    int currentIndex = booksOnTheShelf.indexOf(tokens[1]);
                    String currentName = tokens[1];
                    booksOnTheShelf.set(booksOnTheShelf.indexOf(tokens[2]), currentName);
                    booksOnTheShelf.set(currentIndex, tokens[2]);
                }
            } else if ("Insert Book".equals(tokens[0])) {
                    booksOnTheShelf.add(tokens[1]);
            } else if ("Check Book".equals(tokens[0])) {
                if ((Integer.parseInt(tokens[1])) >= 0 && (Integer.parseInt(tokens[1])) < booksOnTheShelf.size()) {
                    System.out.println(booksOnTheShelf.get(Integer.parseInt(tokens[1])));
                }
            }
            command = scanner.nextLine();
        }
        System.out.print(booksOnTheShelf.toString().replaceAll("[\\[\\]]", ""));
    }
}
