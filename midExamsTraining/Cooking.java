import java.util.*;
import java.util.stream.Collectors;

public class Cooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queueLiquids = new ArrayDeque<>();
        int[] liquids = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        for (int liquid : liquids) {
            queueLiquids.offer(liquid);
        }
        ArrayDeque<Integer> stackIngredients = new ArrayDeque<>();
        int[] ingredients = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        for (int ingredient : ingredients) {
            stackIngredients.push(ingredient);
        }

        TreeMap<String, Integer> food = new TreeMap<>();
        food.put("Bread", 0);
        food.put("Cake", 0);
        food.put("Pastry", 0);
        food.put("Fruit Pie", 0);


        while (!stackIngredients.isEmpty() && !queueLiquids.isEmpty()) {
            if (hasAllFoods(food)) {
                break;
            }
            int liquid = queueLiquids.peek();
            int ingredient = stackIngredients.pop();
            int sum = liquid + ingredient;
            if (sum == 25) {
                queueLiquids.poll();
                food.put("Bread", food.get("Bread") + 1);
            } else if (sum == 50) {
                queueLiquids.poll();
                food.put("Cake", food.get("Cake") + 1);
            } else if (sum == 75) {
                queueLiquids.poll();
                food.put("Pastry", food.get("Pastry") + 1);
            } else if (sum == 100) {
                queueLiquids.poll();
                food.put("Fruit Pie", food.get("Fruit Pie") + 1);
            } else {
                queueLiquids.poll();
                stackIngredients.push(ingredient + 3);
            }
        }
        if (hasAllFoods(food)) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else{
            System.out.println("Ugh, what a pity! You didn't have enough materials to to cook everything.");
        }

        String liquidsOutput = "Liquids left: " + (queueLiquids.isEmpty() ? "none" :
                queueLiquids.stream().map(String::valueOf)
                        .collect(Collectors.joining(", ")));
        System.out.println(liquidsOutput);

        String ingredientsOutput = "Ingredients left: " + (stackIngredients.isEmpty() ? "none" :
                stackIngredients.stream().map(String::valueOf)
                        .collect(Collectors.joining(", ")));
        System.out.println(ingredientsOutput);
        for (Map.Entry<String, Integer> entry : food.entrySet()) {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue()));
        }
    }

    private static boolean hasAllFoods(TreeMap<String, Integer> food) {
        return food.get("Bread") >= 1 &&
                food.get("Cake") >= 1 &&
                food.get("Pastry") >= 1 &&
                food.get("Fruit Pie") >= 1;
    }
}