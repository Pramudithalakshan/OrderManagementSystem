package org.craftigen.mapper;

import org.craftigen.dtos.ProductDTO;
import org.craftigen.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductDTO product);
    ProductDTO toDto(ProductDTO product);
    List<ProductDTO> toDto(List<Product> products);
}
