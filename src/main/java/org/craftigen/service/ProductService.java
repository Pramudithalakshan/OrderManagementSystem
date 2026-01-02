package org.craftigen.service;

import org.craftigen.dtos.ProductDTO;
import org.craftigen.model.Product;
import org.craftigen.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repository;
    ProductService(ProductRepository repository){
        this.repository=repository;
    }

    public List<Product> getProduct(){
        return repository.findAll();
    }
    public void addProduct(@RequestBody ProductDTO product){
        Product persistentProduct = new Product();
        persistentProduct.setId(product.getId());
        persistentProduct.setName(product.getName());
        persistentProduct.setPrice(product.getPrice());
        persistentProduct.setAdded_date(product.getAdded_date());
        persistentProduct.setExpiry_date(product.getExpiry_date());
        repository.save(persistentProduct);
    }
}
