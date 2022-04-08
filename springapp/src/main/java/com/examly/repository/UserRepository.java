package com.examly.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;

import com.examly.springapp.model.UserModel;

@Repository
 public interface UserRepository extends JpaRepository<UserModel, String>{
    

 public UserModel findByEmailAndPassword(String email,String password);

 public UserModel findUserByEmail(String Email);

 @Async
 @Query("select u.role,u.email from UserModel u where u.email= email")
 public UserModel findByEmailAndRole(@Param("role") String role,@Param("email") String email);
}