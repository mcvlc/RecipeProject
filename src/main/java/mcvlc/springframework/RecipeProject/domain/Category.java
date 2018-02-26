package mcvlc.springframework.RecipeProject.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter

public class Category {

    private String id;
    private String description;
    private Set<Recipe> recipes;

}
