package com.springboot.aprtment.winstonbackend.Controller;

import com.springboot.aprtment.winstonbackend.EmailService.EmailService;
import com.springboot.aprtment.winstonbackend.Entity.User;
import com.springboot.aprtment.winstonbackend.Service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:3000/")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/register")
    public User saveUser(@RequestBody User user){
        User saveUser= userService.saveUser(user);
        emailService.sendRegistrationEmailSuccess(saveUser);
        return userService.saveUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return userService.findByid(id);
    }

    // Delete user by ID
    @DeleteMapping("/delete/{id}")
    public String     deleteUserById(@PathVariable Long id) {
        userService.deleteById(id);
        return "deleted successifuly";
    }
    @GetMapping("/user/{name}")
     public  User getByName(@PathVariable String name){
        return userService.findByName(name);
     }


}
