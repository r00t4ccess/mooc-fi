/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes = new ArrayList<>();
    
    public RecipeList(String inputFile) {
        try {
            File myFile = new File(inputFile);
            Scanner reader = new Scanner(myFile);
            
            while (reader.hasNextLine()) {
                String recipeName = reader.nextLine();
                int cookTime = Integer.valueOf(reader.nextLine());
                Recipe recipe = new Recipe(recipeName, cookTime);
                recipes.add(recipe);
                String ingredient = null;
                while (reader.hasNextLine()) {
                    if (!((ingredient = reader.nextLine()).isEmpty())) {
                        recipe.addIngredient(ingredient);
                    } else {
                        break;
                    }
                    
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Reading the file " + inputFile + " has failed. " + e.getLocalizedMessage());
        }
    }
    
    public void listRecipes() {
        for (Recipe i : recipes) {
            System.out.println(i.toString());
        }
    }
    
    public void findRecipeByName(String word) {
        for (Recipe i : recipes) {
            if (i.getRecipeName().toLowerCase().contains(word.toLowerCase())) {
                System.out.println(i.toString());
            }
        }
    }
    
    public void findRecipeByCookTime(int time) {
        for (Recipe i : recipes) {
            if (i.getCookTime() <= time) {
                System.out.println(i.toString());
            }
        }
    }
    
    public void findRecipeByIngredients(String ingredient) {
        for (Recipe i : recipes) {
            if (i.getIngredients().contains(ingredient.toLowerCase())) {
                System.out.println(i.toString());
            }
        }
    }
    
}
