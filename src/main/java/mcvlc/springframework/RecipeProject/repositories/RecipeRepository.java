package mcvlc.springframework.RecipeProject.repositories;

import mcvlc.springframework.RecipeProject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
