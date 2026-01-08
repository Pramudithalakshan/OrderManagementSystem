package org.craftigen.repository;

import org.craftigen.entity.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplierRepository extends MongoRepository<Supplier,String> {
}
