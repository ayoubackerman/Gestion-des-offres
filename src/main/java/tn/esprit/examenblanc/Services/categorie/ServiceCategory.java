package tn.esprit.examenblanc.Services.categorie;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.examenblanc.Entities.Category;
import tn.esprit.examenblanc.Repository.CategoryRepository;
import tn.esprit.examenblanc.dto.CategoryDto;


import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceCategory implements IServiceCategory{
    private final CategoryRepository categoryRepository;

    public Category CreateCategory(CategoryDto cat){
      Category category = new Category();
      category.setId(cat.getId());
      category.setName(cat.getName());
      category.setDescription(cat.getDescription());
      return categoryRepository.save(category);


    }

    public List<Category>getAllCategory(){
        return categoryRepository.findAll();
    }


    public CategoryDto getcatById(Long id){
        Optional<Category> optionalItems = categoryRepository.findById(id);
        if (optionalItems.isPresent()){
            return optionalItems.get().getDto();
        }else {
            return null;
        }

    }

    public CategoryDto updateDto(Long id , CategoryDto itemsDto) throws IOException {
        Optional<Category> optionalItems = categoryRepository.findById(id);
        if (optionalItems.isPresent() ){
            Category category = optionalItems.get();
            category.setName(itemsDto.getName());
            category.setDescription(itemsDto.getDescription());
            return categoryRepository.save(category).getDto();
        }else {
            return null;
        }
    }


    public boolean deleteitem(Long id){
        Optional<Category> optionalItems= categoryRepository.findById(id);
        if(optionalItems.isPresent()){
            categoryRepository.deleteById(id);
            return true;
        }else {
            return false;
        }
    }


}
