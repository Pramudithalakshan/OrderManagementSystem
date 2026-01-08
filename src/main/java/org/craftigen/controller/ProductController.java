package org.craftigen.controller;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.ProductDTO;
import org.craftigen.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/get-product")
    public List<ProductDTO> getProductDetails(){
        return productService.getProduct();
    }
    @PostMapping("/add-product")
    public void addProduct(@RequestBody ProductDTO product){
        productService.addProduct(product);
    }
    @DeleteMapping("/remove-product/{id}")
    public void deleteCustomer(@PathVariable String id){
        productService.deleteProduct(id);
    }
}
