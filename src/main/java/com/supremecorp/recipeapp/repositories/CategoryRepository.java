package com.supremecorp.recipeapp.repositories;

import com.supremecorp.recipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by suprememajor on the 9/10/21
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
