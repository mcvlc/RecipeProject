package mcvlc.springframework.RecipeProject.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class NotesCommand {
    private String id;
    private String recipeNotes;
}
