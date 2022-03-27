package com.examly.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.examly.model.User;

@Component
@Repository
public interface UserDao extends CrudRepository<User, String> {

}
