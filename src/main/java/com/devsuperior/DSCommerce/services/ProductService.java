package com.devsuperior.DSCommerce.services;

import com.devsuperior.DSCommerce.DTO.ProductDTO;
import com.devsuperior.DSCommerce.entities.Product;
import com.devsuperior.DSCommerce.repositories.ProductRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    @Transactional(readOnly = true)
    public ProductDTO FindById(Long id){
       Optional<Product> obj =  repository.findById(id);
       Product entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found!"));
        return new ProductDTO(entity);
    }
}
