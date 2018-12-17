package guru.springframeowk.controller;

import guru.springframeowk.domain.Category;
import guru.springframeowk.domain.UnitOfMeasure;
import guru.springframeowk.repositories.CategoryRepository;
import guru.springframeowk.repositories.UnitOfMeasureRepository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import java.util.ServiceLoader;

public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional= categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional= unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("category id" + categoryOptional.get().getId());
        System.out.println("UOM  id" + unitOfMeasureOptional.get().getId());


        return "index";
    }
}
