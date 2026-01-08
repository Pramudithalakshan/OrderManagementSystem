package org.craftigen.service.impl;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.ProductDTO;
import org.craftigen.mapper.ProductMapper;
import org.craftigen.repository.ProductRepository;
import org.craftigen.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {
    private final ProductRepository repository;
    private final ProductMapper productMapper;

    @Override
    public List<ProductDTO> getProduct() {
        return productMapper.toDto(repository.findAll());
    }

    @Override
    public void addProduct(ProductDTO product) {
        repository.save(productMapper.toEntity(product));
    }
}
