package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.Repositories.IProductRepo;
import com.geekster.EcommerceProject.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;
    public Optional<Product> getAll(String category) {
        return productRepo.findById(Long.valueOf(category));
    }

    public void deleteById(Long id) {
        productRepo.deleteById(id);
    }
}
