package SetAndMapAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Map<String,String> phonebook = new HashMap<>();

        String input = "";

        while (!"search".equals(input = scanner.nextLine())){
            String[] tokens = input.split("-");
            phonebook.put(tokens[0], tokens[1]);
        }

        while (!"stop".equals(input=scanner.nextLine())){
            if (phonebook.containsKey(input)){
                System.out.printf("%s -> %s%n",input,phonebook.get(input));
            }else{
                System.out.printf("Contact %s does not exist.%n",input);
            }
        }
    }
}
