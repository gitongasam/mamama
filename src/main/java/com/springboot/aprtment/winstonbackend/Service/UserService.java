package com.springboot.aprtment.winstonbackend.Service;

import com.springboot.aprtment.winstonbackend.Entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface   UserService {
    User saveUser(User user);



    User getUser(String UserName);



    List<User> getAllUsers();

    ResponseEntity<User> findByid(Long id);

    ResponseEntity<?> deleteById(Long id);

    User findUserByid(Long id);
//    User updateUser(Long id, User newUser);


    User findByName(String name);
}
