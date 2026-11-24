import java.util.Scanner;

public class RecipeIngredientScaler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ingredients = {"Rice", "Sugar", "Milk", "Oil"};
        double[] quantities = {200, 50, 500, 30};

        System.out.println("===== RECIPE INGREDIENT SCALER =====");

        System.out.print("Enter original number of servings: ");
        int original = sc.nextInt();

        System.out.print("Enter required number of servings: ");
        int required = sc.nextInt();

        if (original <= 0 || required <= 0) {
            System.out.println("Invalid serving quantity!");
        } else {
            double factor = (double) required / original;

            System.out.println("\n===== UPDATED INGREDIENTS =====");

            for (int i = 0; i < ingredients.length; i++) {
                double amount = quantities[i] * factor;

                System.out.println(ingredients[i] + ": "
                        + amount + " grams/ml");
            }

            System.out.println("\nRecipe successfully scaled!");
        }

        sc.close();
    }
}
