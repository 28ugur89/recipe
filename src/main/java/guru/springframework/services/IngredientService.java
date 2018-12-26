package guru.springframework.services;


import guru.springframework.commands.IngredientCommand;
import guru.springframework.domain.Ingredient;
import guru.springframework.domain.Recipe;

import java.util.Set;

public interface IngredientService  {

    //Set<Ingredient> getIngredients(Long l);

    Recipe findById(Long l);
    Ingredient findByIngredientId(long l);

    void deleteById(Long recipeId, Long idToDelete);


    Recipe saveIngredient(Recipe ingredient);


   // IngredientCommand saveIngredientCommand(IngredientCommand command);


}
