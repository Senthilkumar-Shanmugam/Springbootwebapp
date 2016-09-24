package com.tribles.repository;

import org.springframework.data.repository.CrudRepository;

import com.tribles.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
