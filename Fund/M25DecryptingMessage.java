import java.util.Scanner;

public class M25DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());//четем ключа, който ще прибавим към подадения символ, за да разберем новият символ
        int countOfChar = Integer.parseInt(scanner.nextLine());//четем броя на символите, който ще имаме

        String decrypted = "";//тук ще събираме новите символи

        for (int i = 0; i < countOfChar; i++) {//въртим цикъла до броя на символите
            char word = scanner.nextLine().charAt(0);//четем символа като чар
            word += key;//добавяме към символа ключа, за да получим новия символ
            decrypted +=Character.toString(word);//добавяме новия символ към думата, която търсим
            //Character.toString(тук се посочва кой чар ще конвертираме към тринг)-метода конвертира чар към стринг
        }

        System.out.println(decrypted);//печатим резултата
    }
}
