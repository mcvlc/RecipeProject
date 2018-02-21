package mcvlc.springframework.RecipeProject.converters;

import lombok.Synchronized;
import mcvlc.springframework.RecipeProject.commands.IngredientCommand;
import mcvlc.springframework.RecipeProject.domain.Ingredient;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class IngredientToIngredientCommand implements Converter<Ingredient, IngredientCommand> {

    private final UnitOfMeasureToUnitOfMeasureCommand uomConverter;

    public IngredientToIngredientCommand(UnitOfMeasureToUnitOfMeasureCommand uomConverter) {
        this.uomConverter = uomConverter;
    }


    @Synchronized
    @Nullable
    @Override
    public IngredientCommand convert(Ingredient source) {

        if (source == null) {
            return null;
        }

        final IngredientCommand ingredientCommand = new IngredientCommand();

        ingredientCommand.setId(source.getId());
        ingredientCommand.setDescription(source.getDescription());
        ingredientCommand.setAmount(source.getAmount());
        ingredientCommand.setUnitOfMeasure(uomConverter.convert(source.getUom()));

        return ingredientCommand;
    }
}