package mcvlc.springframework.RecipeProject.services;

import mcvlc.springframework.RecipeProject.commands.RecipeCommand;
import mcvlc.springframework.RecipeProject.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand findCommandById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(String idToDelete);
}
