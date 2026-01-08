package org.craftigen.controller;

import lombok.RequiredArgsConstructor;
import org.craftigen.dtos.SupplierDTO;
import org.craftigen.service.impl.SupplierImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/supplier")
@RequiredArgsConstructor
public class SupplierController {
    private final SupplierImpl supplierService;

    @PostMapping("/add-supplier")
    public void addSupplier(@RequestBody SupplierDTO supplier){
        supplierService.registerSupplier(supplier);
    }
    @GetMapping("/get-supplier")
    public List<SupplierDTO> getSupplierS(){
        return supplierService.getSupplier();
    }

}
