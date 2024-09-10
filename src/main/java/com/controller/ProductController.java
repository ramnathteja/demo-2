package com.controller;

import org.springframework.web.bind.annotation.*;

import com.model.ProductDTO;
import com.service.ProductServiceBL;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductServiceBL productServiceBL;

    public ProductController(ProductServiceBL productServiceBL) {
        this.productServiceBL = productServiceBL;
    }

    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return productServiceBL.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable String id) {
        return productServiceBL.getProductById(id);
    }

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        return productServiceBL.createNewProduct(productDTO);
    }

    @PutMapping("/{id}")
    public ProductDTO updateProduct(@PathVariable String id, @RequestBody ProductDTO productDTO) {
        return productServiceBL.updateProduct(id, productDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productServiceBL.deleteProduct(id);
    }

}