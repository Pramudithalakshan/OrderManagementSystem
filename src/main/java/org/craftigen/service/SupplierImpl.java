package org.craftigen.service;

import org.craftigen.dtos.SupplierDTO;
import org.craftigen.entity.Supplier;
import org.craftigen.mapper.SupplierMapper;
import org.craftigen.repository.SupplierRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class SupplierImpl implements SupplierService {
    private final SupplierRepository repository;
    private final SupplierMapper mapper;

    SupplierImpl(SupplierRepository repository, SupplierMapper mapper){
        this.repository=repository;
        this.mapper=mapper;
    }
    @Override
    public void registerSupplier(@RequestBody SupplierDTO supplier) {
        repository.save(mapper.toEntity(supplier));
    }

    @Override
    public List<Supplier> getSupplier() {
        return List.of();
    }
}
