package com.supremecorp.recipeapp.repositories;

import com.supremecorp.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by suprememajor on the 9/10/21
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
