import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E59PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfRemoveIndex = 0;

        while (pokemons.size() > 0) {

            int index = Integer.parseInt(scanner.nextLine());
            int temp = 0;

            if (index < 0) {
                index = 0;
                temp = pokemons.get(index);
                sumOfRemoveIndex += temp;
                pokemons.remove(index);
                pokemons.add(0, pokemons.get(pokemons.size() - 1));
            } else if (index > pokemons.size() - 1) {
                index = pokemons.size() - 1;
                temp = pokemons.get(index);
                sumOfRemoveIndex += temp;
                pokemons.remove(pokemons.size() - 1);
                pokemons.add(pokemons.get(0));
            } else {
                temp = pokemons.get(index);
                sumOfRemoveIndex += temp;
                pokemons.remove(index);
            }

            listWhitChange(pokemons, temp);

            if (pokemons.size() == 1) {
                sumOfRemoveIndex += pokemons.get(0);
                pokemons.remove(0);
                break;
            }
        }
        System.out.println(sumOfRemoveIndex);
    }

    private static void listWhitChange(List<Integer> list, int temp) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= temp) {
                list.set(i, list.get(i) + temp);
            } else {
                list.set(i, list.get(i) - temp);
            }
        }
    }
}
