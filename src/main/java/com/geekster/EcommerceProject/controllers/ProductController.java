package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.models.Product;
import com.geekster.EcommerceProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(value = "/getAllProduct/{category}")
    public Optional<Product> getAllProduct(@PathVariable String category){
       return productService.getAll(category);
    }

    @DeleteMapping(value = "/deleteproductById/{id}")
    public void deleteById(@PathVariable Long id){
        productService.deleteById(id);
    }
}
