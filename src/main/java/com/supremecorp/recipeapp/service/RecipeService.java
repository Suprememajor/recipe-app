package com.supremecorp.recipeapp.service;

import com.supremecorp.recipeapp.model.Recipe;

import java.util.Set;

/**
 * Created by suprememajor on the 9/10/21
 */
public interface RecipeService {
    Set<Recipe> getRecipes();
}
