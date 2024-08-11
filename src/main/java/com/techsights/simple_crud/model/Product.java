package com.techsights.simple_crud.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// The @Entity annotation indicates that this class is a JPA entity.
// JPA will map this class to a table named 'Product' in the database.
@Entity
public class Product {

    // The @Id annotation marks the field 'id' as the primary key.
    // The @GeneratedValue annotation indicates that the ID should be generated automatically.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    // Default constructor for JPA
    public Product() {
    }

    // Parameterized constructor for easier object creation
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters for accessing and modifying the fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}