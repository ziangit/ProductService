package com.zs.productservice2.repository;

import com.zs.productservice2.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}


