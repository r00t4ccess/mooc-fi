/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author larry
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    private String recipeName;
    private int cookTime;
    private ArrayList<String> ingredients; 
    
    public Recipe(String name, int time) {
        this.recipeName = name;
        this.cookTime = time;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String input) {
        this.ingredients.add(input.toLowerCase());
    }
    
    public String getRecipeName() {
        return this.recipeName;
    }
    
    public int getCookTime() {
        return this.cookTime;
    }
    
    public ArrayList getIngredients() {
        return this.ingredients;
    }
    
    public String toString() {
        return this.recipeName + ", cooking time: " + this.cookTime + ".";
    }
    

}
