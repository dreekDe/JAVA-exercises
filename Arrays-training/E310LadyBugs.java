import java.util.Scanner;

public class E310LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = Integer.parseInt(scanner.nextLine());
        String[] positionBusy = scanner.nextLine().split(" ");
        int[] ladybugs = new int[sizeOfArray];

        for (String elements : positionBusy) {
            int i = Integer.parseInt(elements);
            if (i >= 0 && i < ladybugs.length) {
                ladybugs[i] = 1;
            }
        }
        String input = scanner.nextLine();

        while (!"end".equals(input)) {

            String[] command = input.split(" ");

            int indexBug = Integer.parseInt(command[0]);
            String direction = command[1];
            int stepToMove = Integer.parseInt(command[2]);

            if (indexBug >= 0 && indexBug < ladybugs.length && ladybugs[indexBug] == 1) {

                ladybugs[indexBug] = 0;

                if (direction.equals("right")) {
                    indexBug += stepToMove;

                    while (indexBug < ladybugs.length && ladybugs[indexBug] == 1) {
                        indexBug += stepToMove;
                    }
                    if (indexBug < ladybugs.length) {
                        ladybugs[indexBug] = 1;
                    }
                } else {
                    indexBug -= stepToMove;

                    while (indexBug >= 0 && ladybugs[indexBug] == 1) {
                        indexBug -= stepToMove;
                    }
                    if (indexBug >= 0) {
                        ladybugs[indexBug] = 1;
                    }
                }
            }
            input = scanner.nextLine();
        }

        for (int ladybug : ladybugs) {
            System.out.print(ladybug + " ");
        }
    }
}






