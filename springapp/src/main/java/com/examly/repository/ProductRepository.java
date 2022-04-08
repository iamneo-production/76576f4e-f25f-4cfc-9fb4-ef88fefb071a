package com.examly.springapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.examly.springapp.model.ProductModel;

@Repository
public interface ProductRepository extends CrudRepository<ProductModel, String>{
    
}
