package org.craftigen.mapper;

import org.craftigen.dtos.ProductDTO;
import org.craftigen.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductDTO product);
    ProductDTO toDto(Product product);
}
