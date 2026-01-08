package org.craftigen.service.impl;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.SupplierDTO;
import org.craftigen.mapper.SupplierMapper;
import org.craftigen.repository.SupplierRepository;
import org.craftigen.service.SupplierService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SupplierImpl implements SupplierService {
    private final SupplierRepository repository;
    private final SupplierMapper supplierMapper;

    @Override
    public void registerSupplier(@RequestBody SupplierDTO supplier) {
        repository.save(supplierMapper.toEntity(supplier));
    }

    @Override
    public List<SupplierDTO> getSupplier() {
        return supplierMapper.toDto(repository.findAll());
    }

    @Override
    public void deleteSupplier(String id) {
        repository.deleteById(id);
    }
}
