
/*
Напишете програма, която чете текст от конзолата и намира най-дългия палиндром в този текст.
Нека намерения палиндром бъде принтиран на конзолата.
Ако няма намерен палиндром - да се принтира съобщение за грешка.
Палиндром а дума, която се чете еднакво, и отпред назад, и отзад напред.
Пример: "madam", "kayak", "wow", "asdsa", "saippuakivikauppias", "tattarrattat" 
*/



import java.util.*;

public class task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> text = new ArrayList<>();
        Collections.addAll(text, scanner.nextLine().toLowerCase().replaceAll("[^a-z ]", "").split("\\s+"));

        TreeMap<Integer, String> palindromes = new TreeMap<>();

        for (String word : text) {
            if (word.length() > 1 && palindrome(word)) {
                palindromes.putIfAbsent(word.length(), word);
            }
        }

        if (palindromes.isEmpty()) {
            System.out.print("Error!");
        } else {
            System.out.println(palindromes.get(palindromes.lastKey()));
        }
    }


    private static boolean palindrome(String word) {
        StringBuilder reversWord = new StringBuilder(word).reverse();
        return word.equals(reversWord.toString());
    }
}
