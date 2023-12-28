package com.app.affan.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.affan.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
