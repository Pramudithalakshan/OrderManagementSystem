package org.craftigen.controller;

import org.craftigen.model.Product;
import org.craftigen.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")

public class ProductController {
    private ProductRepository repository;
    @Autowired
    ProductController(ProductRepository repository){
        this.repository=repository;
    }
    @GetMapping("/get-product")
    public List<Product> getProductDetails(){
        return repository.findAll();
    }
    @PostMapping("/add-product")
    public void addProduct(@RequestBody Product product){
        repository.save(product);
    }
}
