package mcvlc.springframework.RecipeProject.converters;

import lombok.Synchronized;
import mcvlc.springframework.RecipeProject.commands.RecipeCommand;
import mcvlc.springframework.RecipeProject.domain.Recipe;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class RecipeCommandToRecipe implements Converter<RecipeCommand, Recipe> {

    private final NotesCommandToNotes notesCommandToNotes;
    private final CategoryCommandToCategory categoryCommandToCategory;
    private final IngredientCommandToIngredient ingredientCommandToIngredient;

    public RecipeCommandToRecipe(NotesCommandToNotes notesCommandToNotes, CategoryCommandToCategory categoryCommandToCategory, IngredientCommandToIngredient ingredientCommandToIngredient) {
        this.notesCommandToNotes = notesCommandToNotes;
        this.categoryCommandToCategory = categoryCommandToCategory;
        this.ingredientCommandToIngredient = ingredientCommandToIngredient;
    }

    @Synchronized
    @Nullable
    @Override
    public Recipe convert(RecipeCommand command) {
        if (command == null) {
            return null;
        }

        final Recipe recipe = new Recipe();

        recipe.setId(command.getId());
        recipe.setSource(command.getSource());
        recipe.setServings(command.getServings());
        recipe.setUrl(command.getUrl());
        recipe.setCookTime(command.getCookTime());
        recipe.setDescription(command.getDescription());
        recipe.setDifficulty(command.getDifficulty());
        recipe.setDirections(command.getDirections());
        recipe.setNotes(notesCommandToNotes.convert(command.getNotes()));
        recipe.setPrepTime(command.getPrepTime());

        if (command.getCategories() != null && command.getCategories().size() > 0) {
            command.getCategories()
                    .forEach(category -> recipe.getCategories().add(categoryCommandToCategory.convert(category)));
        }
        if (command.getIngredients() != null && command.getIngredients().size() > 0) {
            command.getIngredients()
                    .forEach(ingredient -> recipe.getIngredients().add(ingredientCommandToIngredient.convert(ingredient)));
        }
        return recipe;
    }
}
