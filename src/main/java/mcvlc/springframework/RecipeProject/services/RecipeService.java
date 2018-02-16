package mcvlc.springframework.RecipeProject.services;

import mcvlc.springframework.RecipeProject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
