package tn.esprit.examenblanc.Entities;

import jakarta.persistence.*;
import lombok.Data;
import tn.esprit.examenblanc.dto.CategoryDto;
import tn.esprit.examenblanc.dto.ProductDto;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String name ;
    @Lob
    private String description;

    public CategoryDto getDto(){
        CategoryDto categoryDto =new CategoryDto();
        categoryDto.setId(id);
        categoryDto.setName(name);
        categoryDto.setDescription(description);
        return categoryDto;
    }
}
