package tn.esprit.examenblanc.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import tn.esprit.examenblanc.dto.Devidto;

@Entity
@Data
public class Devi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String description;
    private Long quantity;

    private double price;


    public Devidto getDto() {
        Devidto devidto = new Devidto();
        devidto.setDescription(description);
        devidto.setPrice(price);
        devidto.setQuantity(quantity);
        devidto.setId(id);

        return devidto;
    }
}
