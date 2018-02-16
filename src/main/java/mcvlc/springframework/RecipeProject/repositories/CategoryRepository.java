package mcvlc.springframework.RecipeProject.repositories;

import mcvlc.springframework.RecipeProject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
