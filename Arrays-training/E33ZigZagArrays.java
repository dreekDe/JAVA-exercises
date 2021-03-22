import java.util.Scanner;

public class E33ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsCount = Integer.parseInt(scanner.nextLine());// четем броя на елементите в масива

        String[] firstArr = new String[elementsCount];//правим си 1-ви масив тип стринг с размер до броя подаден на входа
        String[] secondArr = new String[elementsCount];//за 2-ри масив правим същото

        for (int i = 0; i < elementsCount; i++) {//въртим си цикъл до броя на елементите в масива
            String[] inputs = scanner.nextLine().split(" ");//на входа получаваме по 2 елемента разделени със интервал
            //за това направо създаваме масив стринг равен на подадените елементи на конзолата и му казваме да ги сплитне по интервал
            String firstElement = (inputs[0]);//създааме си елементи от тип стриг като указваме на кой елемент от стринг масива отговарят
            String secondElements = (inputs[1]);

            if (i % 2 != 0) {//указваме на четен и нечетен ред кой елемент от стринг масива,на кой елемент в новията масив трябва да отговаря
                firstArr[i] = secondElements;
                secondArr[i] = firstElement;
            } else {
                firstArr[i] = firstElement;
                secondArr[i] = secondElements;
            }
        }
        System.out.println(String.join(" ", firstArr));//принтираме целият масив на един ред с джойнат интервал между елементите
        System.out.println(String.join(" ", secondArr));
    }
}

