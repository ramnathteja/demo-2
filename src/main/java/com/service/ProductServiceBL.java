package com.service;

import java.util.List;

import com.model.ProductDTO;

public interface ProductServiceBL {
    List<ProductDTO> getAllProducts();

    ProductDTO getProductById(String id);

    ProductDTO createNewProduct(ProductDTO dto);

    ProductDTO updateProduct(String id, ProductDTO dto);

    void deleteProduct(String id);

}