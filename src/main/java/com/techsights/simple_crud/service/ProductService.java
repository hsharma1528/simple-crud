package com.techsights.simple_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techsights.simple_crud.model.Product;
import com.techsights.simple_crud.repository.ProductRepository;

// The @Service annotation indicates that this class is a service component in the Spring context.
// It contains business logic for managing products.
@Service
public class ProductService {

    private final ProductRepository productRepository;

    // The @Autowired annotation is used to inject the ProductRepository dependency into this service.
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Method to create or save a product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Method to retrieve all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Method to retrieve a product by ID
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Method to delete a product by ID
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

