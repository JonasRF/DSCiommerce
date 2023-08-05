package com.devsuperior.DSCommerce.services;

import com.devsuperior.DSCommerce.DTO.OrderDTO;
import com.devsuperior.DSCommerce.DTO.ProductDTO;
import com.devsuperior.DSCommerce.entities.Order;
import com.devsuperior.DSCommerce.entities.Product;
import com.devsuperior.DSCommerce.repositories.OrderRepository;
import com.devsuperior.DSCommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;


    @Transactional(readOnly = true)
    public OrderDTO findById(Long id){
        Optional<Order> order =  repository.findById(id);
        Order entity = order.orElseThrow(() -> new ResourceNotFoundException("Resource not found!"));
        return new OrderDTO(entity);
    }
}
