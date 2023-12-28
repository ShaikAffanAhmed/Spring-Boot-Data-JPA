package com.app.affan.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.app.affan.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {


}