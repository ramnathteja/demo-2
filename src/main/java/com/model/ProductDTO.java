package com.model;

import lombok.Data;

@Data
public class ProductDTO {

    private String id;
    private String name;
    private double price;
    private Long stockCount;

}