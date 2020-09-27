
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File to read:");
        String fileName = scanner.nextLine();
        
        RecipeList recipeList = new RecipeList(fileName);
        
        while (true) {
            System.out.println("Commands: \n"
                    + "list - list the recipes \n"
                    + "stop - stops the program \n"
                    + "find name - searches recipes by name \n"
                    + "find cooking time - searches recipes by cooking time \n"
                    + "find ingredient - searches recipes by ingredient"
            );
            String input = scanner.nextLine();
            
            if (input.equals("list")) {
                recipeList.listRecipes();
            } else if (input.equals("stop")) {
                break;
            } else if (input.equals("find name")) {
                System.out.println("Searched word: ");
                String name = scanner.nextLine();
                recipeList.findRecipeByName(name);
            } else if (input.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                recipeList.findRecipeByCookTime(time);
            } else if (input.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                recipeList.findRecipeByIngredients(ingredient);
            }
        }

    }

}
