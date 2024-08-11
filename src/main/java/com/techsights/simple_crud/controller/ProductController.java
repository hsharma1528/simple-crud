package com.techsights.simple_crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsights.simple_crud.model.Product;
import com.techsights.simple_crud.service.ProductService;

// The @RestController annotation indicates that this class is a Spring MVC controller
// where each method returns a domain object instead of a view.
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    // The @Autowired annotation is used to inject the ProductService dependency into this controller.
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Method to handle HTTP POST requests for creating a new product
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    // Method to handle HTTP GET requests for retrieving all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Method to handle HTTP GET requests for retrieving a product by ID
    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // Method to handle HTTP DELETE requests for deleting a product by ID
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}

