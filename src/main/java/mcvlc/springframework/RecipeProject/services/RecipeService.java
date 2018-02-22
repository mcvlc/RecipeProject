package mcvlc.springframework.RecipeProject.services;

import mcvlc.springframework.RecipeProject.commands.RecipeCommand;
import mcvlc.springframework.RecipeProject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long l);
}
