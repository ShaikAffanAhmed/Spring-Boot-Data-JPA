package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.affan.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
            
}
