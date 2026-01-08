package org.craftigen.service;

import org.craftigen.dtos.ProductDTO;
import org.craftigen.entity.Product;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {
    public List<Product> getProduct();
    public void addProduct(@RequestBody ProductDTO product);
}
