import java.util.Scanner;

public class manipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        int[] array = new int[data.length];

        for (int i = 0; i < data.length; i++) {
            array[i] = Integer.parseInt(data[i]);//vzemame poziciqta ot stringoviq masiv i go parswame
        }

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");

            String command = tokens[0];
            switch (command) {
                case "exchange": {
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= array.length) {
                        System.out.println("Invalid index");
                    } else {
                        exchange(array, index);
                    }
                }
                break;
                case "min": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMinEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        findMinOdd(array);
                    }
                }
                break;
                case "max": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMaxEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        findMaxOdd(array);
                    }
                }
                break;
                case "first": {
                    int count = Integer.parseInt(tokens[1]);
                    String evenOrOdd = tokens[2];
                    if (evenOrOdd.equals("even")) {
                        findFirstCountEvenNumbers(array, count);
                    } else if (evenOrOdd.equals("odd")) {
                        findFirstCountOddNumbers(array, count);
                    }
                }
                break;
                case "last": {
                    int count = Integer.parseInt(tokens[1]);
                    String evenOrOdd = tokens[2];
                    if (evenOrOdd.equals("even")) {
                        findLastCountEvenNumbers(array, count);
                    } else if (evenOrOdd.equals("odd")) {
                        findLastCountOddNumbers(array, count);
                    }
                }
                break;
            }
            input = scanner.next();
        }
    }

    private static void findLastCountOddNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
               // result = expandAndAddToArray(result, array[от какжво???]);
            }
            if (result.length == count) {
                break;
            }
        }
        reverseArray(array);
        print(array);

    }

    private static void findLastCountEvenNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                //ne6to trqbva da ima ot expand....
            }
            if (result.length == count) {
                break;
            }
        }
        reverseArray(array);
        print(array);

    }

    private static void reverseArray(int[] array) {
        int[] temp = copyArray(array);
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = temp[array.length - i];
        }
    }

    private static void findFirstCountOddNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                expandAndAddToArray(result, array[i]);
                if (result.length == count) {
                    break;
                }
            }
        }
        print(result);
    }


    private static void findFirstCountEvenNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                expandAndAddToArray(result, array[i]);
                if (result.length == count) {
                    break;
                }
            }
        }
        print(result);
    }

    private static void print(int[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.println(array[i]);
            }
            System.out.println(", " + array[i]);
        }
        System.out.println("]");
    }

    private static void expandAndAddToArray(int[] oldArray, int newElement) {
        int[] newArray = new int[oldArray.length + 1];
        for (int j = 0; j < oldArray.length; j++) {
            newArray[0] = oldArray[0];//tova ne e vqrno
        }
        newArray[newArray.length - 1] = newElement;
    }

    public static void findMaxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;//ako ima -1 na printera zna4i imame gre6ka - -1 e tip proverka
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    public static void findMaxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1;//ako ima -1 na printera zna4i imame gre6ka - -1 e tip proverka
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && max <= array[i]) {
                max = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }


    public static void findMinOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;//ako ima -1 na printera zna4i imame gre6ka - -1 e tip proverka
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    public static void findMinEven(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1;//ako ima -1 na printera zna4i imame gre6ka - -1 e tip proverka
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && min >= array[i]) {
                min = array[i];
                index = i;
            }
        }
        if (index == -1) {
            System.out.println(index);
        } else {
            System.out.println("No matches");
        }
    }

    public static void exchange(int[] array, int index) {
        int[] temp = copyArray(array);
        int count = 0;
        for (int i = index + 1; i < temp.length; i++) {
            array[count] = temp[i];
            count++;
        }
        for (int i = 0; i <= index; i++) {
            array[count] = temp[i];
            count++;
        }
    }

    public static int[] copyArray(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
