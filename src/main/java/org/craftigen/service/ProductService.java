package org.craftigen.service;

import org.craftigen.dtos.ProductDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface ProductService {
     List<ProductDTO> getProduct();
     void addProduct(@RequestBody ProductDTO product);
}
