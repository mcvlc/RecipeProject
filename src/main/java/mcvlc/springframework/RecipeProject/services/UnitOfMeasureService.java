package mcvlc.springframework.RecipeProject.services;

import mcvlc.springframework.RecipeProject.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
