package mcvlc.springframework.RecipeProject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mcvlc.springframework.RecipeProject.domain.Difficulty;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class RecipeCommand {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Set<IngredientCommand> ingredients = new HashSet<>();
    private NotesCommand notes;
    private Set<CategoryCommand> categories = new HashSet<>();
    private Difficulty difficulty;
}