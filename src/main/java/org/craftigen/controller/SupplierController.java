package org.craftigen.controller;

import org.craftigen.dtos.SupplierDTO;
import org.craftigen.service.SupplierImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SupplierController {
    private final SupplierImpl supplierService;
    SupplierController(SupplierImpl supplierService){
        this.supplierService=supplierService;
    }
    public void addSupplier(@RequestBody SupplierDTO supplier){
        supplierService.registerSupplier(supplier);
    }
}
