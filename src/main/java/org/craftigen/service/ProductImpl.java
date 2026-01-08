package org.craftigen.service;

import org.craftigen.dtos.ProductDTO;
import org.craftigen.entity.Product;
import org.craftigen.mapper.ProductMapper;
import org.craftigen.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductImpl implements ProductService{
    private final ProductRepository repository;
    private final ProductMapper productMapper;
    ProductImpl(ProductRepository repository, ProductMapper productMapper){
        this.repository=repository;
        this.productMapper=productMapper;
    }

    @Override
    public List<Product> getProduct() {
        return repository.findAll();
    }

    @Override
    public void addProduct(ProductDTO product) {
        repository.save(productMapper.toEntity(product));
    }
}
