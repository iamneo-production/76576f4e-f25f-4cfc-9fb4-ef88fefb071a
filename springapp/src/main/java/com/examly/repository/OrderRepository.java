package com.examly.springapp.repository;

import com.examly.springapp.model.CartModel;
import com.examly.springapp.model.OrderModel;
import com.examly.springapp.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer> {
    List<Order> findAllByUserOrderByCreatedDateDesc(User user);

}
