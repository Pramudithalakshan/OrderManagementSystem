package org.craftigen.mapper;

import org.craftigen.dtos.SupplierDTO;
import org.craftigen.entity.Supplier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SupplierMapper {
    Supplier toEntity(SupplierDTO supplier);
    SupplierDTO toDto(Supplier supplier);
}
