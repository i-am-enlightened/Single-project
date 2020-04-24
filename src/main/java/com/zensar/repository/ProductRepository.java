package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;
import com.zensar.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
