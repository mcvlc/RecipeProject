package mcvlc.springframework.RecipeProject.controllers;

import lombok.extern.slf4j.Slf4j;
import mcvlc.springframework.RecipeProject.domain.Category;
import mcvlc.springframework.RecipeProject.domain.UnitOfMeasure;
import mcvlc.springframework.RecipeProject.repositories.CategoryRepository;
import mcvlc.springframework.RecipeProject.repositories.UnitOfMeasureRepository;
import mcvlc.springframework.RecipeProject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Getting Index page");

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
