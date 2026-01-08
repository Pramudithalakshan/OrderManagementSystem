package org.craftigen.service;

import org.craftigen.dtos.SupplierDTO;
import org.craftigen.entity.Supplier;

import java.util.List;

public interface SupplierService {
     void registerSupplier(SupplierDTO supplier);
     List<Supplier> getSupplier();
}
