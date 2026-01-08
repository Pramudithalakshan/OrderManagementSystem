package org.craftigen.service;

import org.craftigen.dtos.SupplierDTO;

import java.util.List;

public interface SupplierService {
     void registerSupplier(SupplierDTO supplier);
     List<SupplierDTO> getSupplier();
     void deleteSupplier(String id);
}
