package com.techsights.simple_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techsights.simple_crud.model.Product;

// The @Repository annotation indicates that this interface is a Spring Data repository.
// Spring Data repositories simplify data access by providing a set of standard CRUD methods
// without the need for boilerplate code. This interface extends JpaRepository, 
// which provides JPA-specific operations, such as saving, finding, deleting entities, 
// and also includes pagination and sorting capabilities.
// The JpaRepository<T, ID> interface requires two type parameters:
// - T: The type of the entity that the repository manages (in this case, Product).
// - ID: The type of the entity's primary key (in this case, Long).
// It provides CRUD operations for the Product entity.
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}