package com.devsuperior.DSCommerce.repositories;

import com.devsuperior.DSCommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface ProductRepository extends JpaRepository<Product, Long> {
    }
