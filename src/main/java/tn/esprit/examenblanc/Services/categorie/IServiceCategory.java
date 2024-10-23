package tn.esprit.examenblanc.Services.categorie;



import tn.esprit.examenblanc.Entities.Category;
import tn.esprit.examenblanc.dto.CategoryDto;

import java.util.List;

public interface IServiceCategory {

    public Category CreateCategory(CategoryDto cat);
    public List<Category> getAllCategory();



    }
