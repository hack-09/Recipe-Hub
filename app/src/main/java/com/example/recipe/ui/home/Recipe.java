package com.example.recipe.ui.home;

public class Recipe {
    private String recipeName;
    private String recipeDescription;
    private String ingredients;
    private String instructions;
    private String serveSize;
    private String cookingTime;
    private String category;

    // Required empty constructor for Firebase
    public Recipe() {
    }

    public Recipe(String recipeName, String recipeDescription, String ingredients, String instructions, String serveSize, String cookingTime, String category) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.serveSize = serveSize;
        this.cookingTime = cookingTime;
        this.category = category;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getServeSize() {
        return serveSize;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
