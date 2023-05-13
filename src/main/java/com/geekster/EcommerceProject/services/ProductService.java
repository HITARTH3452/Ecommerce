package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.Repositories.IProductRepo;
import com.geekster.EcommerceProject.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;


    public void savethis(Product myProduct) {
        productRepo.save(myProduct);
    }

    public List<Product> getProductByCategoryName(String category) {
       return productRepo.findByProductCategory(category);
    }

    public void removeByProductId(Long productId) {
        boolean isPresent = productRepo.existsById(productId);

        if(isPresent){
            productRepo.deleteById(productId);
        }else{
            throw new IllegalStateException("Id does not exist for deletion");
        }
    }
}
