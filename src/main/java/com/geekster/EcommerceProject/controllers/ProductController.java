package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.Repositories.IProductRepo;
import com.geekster.EcommerceProject.models.Product;
import com.geekster.EcommerceProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("addProduct")
    void addUser(@RequestBody Product myProduct){
        productService.savethis(myProduct);
    }

    @GetMapping("/category/{category}")
    List<Product> getProductByCategoryName(@PathVariable String category){
        return productService.getProductByCategoryName(category);
    }

    @DeleteMapping("/{productId}")
    ResponseEntity<Void> removeProductById(@PathVariable Long productId) {
        HttpStatus status;
        try {
            productService.removeByProductId(productId);
            status = HttpStatus.OK;
        }catch (Exception e){
            System.out.println(e);
            status = HttpStatus.NOT_ACCEPTABLE;
        }
        return new ResponseEntity<Void>(status);
    }
}

