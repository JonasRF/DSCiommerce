package com.devsuperior.DSCommerce.repositories;

import com.devsuperior.DSCommerce.entities.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData, Long> {

    Optional<ImageData> findByName(String fileName);
}
