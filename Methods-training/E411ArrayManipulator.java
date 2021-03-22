import java.util.Scanner;

public class E411ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");//четем входа като стринг масив, който ще превърнем в инт масив
        int[] array = new int[input.length];//създаваме инт масив, който запълваме чрез фор

        for (int i = 0; i < input.length; i++) {//завъртаме фор до дължината на масива - или стринг или инт - еднаква е
            array[i] = Integer.parseInt(input[i]);//всеки индекс от инт масива да е равен на съответният индекс от стринг масива
        }
        //до тук имаме вход от стринг, който сме си превърнали в инт масив и можем да си го манипулираме
        String command = scanner.nextLine();//взимаме командите като стринг

        while (!"end".equals(command)) {//до команда край вертим цикъла и изпълняваме команди за манипулиране

            String[] currentCommand = command.split(" ");//превръщаме командите в масив

            if ("exchange".equals(currentCommand[0])) {//четем командата от нулевия символ, ако е exchange:
                int index = Integer.parseInt(currentCommand[1]);
                if (index < 0 || index >= currentCommand.length) {
                    System.out.println("Invalid index");
                }else{
                    exchangeArrayByIndex(array, index);
                }


            }


        }

    }

    private static void exchangeArrayByIndex(int[] array, int index) {
        for (int i = index; i < array.length; i++) {


        }
    }

}
