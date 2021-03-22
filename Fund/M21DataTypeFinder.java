import java.util.Scanner;

public class M21DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//скенера чете от конзолата

        String input = scanner.nextLine();// вземаме входни данни - те винаги са стринг, докато не ги парснем или приравним на нещо друго

        while (!"END".equals(input)){//докато входа е разлияен от END ще въртим цикъла
            Scanner type = new Scanner(input);//скенера прочита подадените входни данни - не чете от конзолата а от първият скенер

            if (type.hasNextBoolean()){// проверяваме дали типа данни (от 2-рия скенер) отговарят на boolean
                System.out.printf("%s is boolean type%n",input);
            }else if (type.hasNextInt()){// проверяваме дали типа данни (от 2-рия скенер) отговарят на int - важно е
                //първо да провериш за инт т.к. ако то върне тру програмата няма да чете кода на долу, ако първо провериш за
                //дабъл - инт се съдържа в дабъл и на конзолата ще ти излезе, че инт е дабъл, а то не е
                System.out.printf("%s is integer type%n",input);
            }else if (type.hasNextDouble()){// проверяваме дали типа данни (от 2-рия скенер) отговарят на double
                System.out.printf("%s is floating point type%n",input);
            }else if (input.length()==1){//обърни внимание, че за чар няма has.Next - за това взимаме входа от 1-вия скенер и
                //ако дължината на стринга - защото първия скенер е прочел стринг - е = 1, значи имаме чар
                System.out.printf("%s is character type%n",input);
            }else if (type.hasNextLine()){// проверяваме дали типа данни (от 2-рия скенер) отговарят на стринг
                System.out.printf("%s is string type%n",input);
            }
            input = scanner.nextLine();//четем следващ вход от конзолата

            /*
            has.Next - чете това което му подаваш като данни и търси типа му - той е булев израз и прави проверка с някакъв патерн - пътека
            ако натиснеш върху него когато го извикваш може да отвориш кода с който се проверява типа, но за момента едва ли ще ти е от полза
            поне аз не успявам да го разбера особено
             */


        }
    }
}
