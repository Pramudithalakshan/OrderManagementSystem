package org.craftigen.controller;

import org.craftigen.model.Product;
import org.craftigen.dtos.ProductDTO;
import org.craftigen.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")

public class ProductController {
    private final ProductService productService;
    @Autowired
    ProductController(ProductService productService){
        this.productService=productService;
    }
    @GetMapping("/get-product")
    public List<Product> getProductDetails(){
        return productService.getProduct();
    }
    @PostMapping("/add-product")
    public void addProduct(@RequestBody ProductDTO product){
        productService.addProduct(product);
    }
}
