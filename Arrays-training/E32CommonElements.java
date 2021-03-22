import java.util.Scanner;

public class E32CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arraysFirst = scanner.nextLine().split(" "); // имаме стринг - всичко е на 1 ред с интервали - направо си правим масив,
        //който да ни е сплитнат по интервал
        String [] arraysSecond = scanner.nextLine().split(" ");// аналогично и за 2-рия инпут

        for (String elementsOne : arraysFirst) {//въртим фориич за всеки елемент - даваме му име елемент едно - от 1-вия масив
            for (String elementsTwo : arraysSecond) {//вложен фориич за втория масив - всеки елемент от 1-вия фориич да се сравни с всеки елемент
                //от втория фориич
                if (elementsOne.equals(elementsTwo)){//ако елемента от 1-ви масив е развен на елемнта от втори масив да го принтира
                    System.out.print(elementsTwo + " ");
                }
            }

        }





    }
}
