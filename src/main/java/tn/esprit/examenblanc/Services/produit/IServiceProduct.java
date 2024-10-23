package tn.esprit.examenblanc.Services.produit;


import tn.esprit.examenblanc.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface IServiceProduct {

    public ProductDto addProduct(ProductDto productDto) throws IOException ;

    public List<ProductDto> getAllProd();
    public List<ProductDto> GetAllByName(String name);
    public boolean deleteprod(Long id);





    }
