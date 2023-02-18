package com.devsuperior.DSCommerce.DTO;

import com.devsuperior.DSCommerce.entities.Product;

import javax.persistence.Column;

public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String img_url;

    public ProductDTO(){
    }

    public ProductDTO(Long id, String name, String description, Double price, String img_url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.img_url = img_url;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        img_url = entity.getImg_url();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImg_url() {
        return img_url;
    }
}
