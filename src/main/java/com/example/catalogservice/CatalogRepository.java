package com.example.catalogservice;

import com.example.catalogservice.entity.CatalogEntity;
import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository {
    CatalogEntity findByProductId(String productId);
}
