package mcvlc.springframework.RecipeProject.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
public class Notes {
    private String id;
    private Recipe recipe;
    private String recipeNotes;
}