/*
Напишете програма, която чете текст от конзолата и намира най-дългия палиндром в този текст.
Нека намерения палиндром бъде принтиран на конзолата.
Ако няма намерен палиндром - да се принтира съобщение за грешка.

Палиндром а дума, която се чете еднакво, и отпред назад, и отзад напред.
Пример: "madam", "kayak", "wow", "asdsa", "saippuakivikauppias", "tattarrattat" 
*/

/* The lines are probably separated by \r\n in your file.
 Both \r (carriage return) and \n (linefeed) are considered line-separator characters in Java regexes, and the . metacharacter won't match either of them. \s will match those characters, so it consumes the \r, but that leaves .* to match the \n, which fails. Your tester probably used just \n to separate the lines, which was consumed by \s."madam", "kayak", "wow"asdsa, saippuakivikauppias tattarrattat
The most common of English palindromes are those that are read character by 
character, for instance, "level," "rotor," and "racecar". Character by character means that each character of the word matches and the word can be spelled the same forwards or backward. "Madam I'm Adam" is a famous character by character palindrome.
Palindrome examples also exist in phrases or sentences where punctuation, capitals, 
and spacing are ignored. For instance "Sit on a potato pan, Otis". One of perhaps the most famous palindromes that exist in this for
m is "AblewasIereIsawElba."*/


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
