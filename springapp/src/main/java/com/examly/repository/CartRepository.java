package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;

import com.examly.springapp.model.CartModel;


@Repository
public interface CartRepository extends JpaRepository<CartModel, String>{

    @Query(value = "SELECT * FROM cart WHERE user_id=?1", nativeQuery = true)
    List<CartModel> findByUserId(String userId);

    
}
