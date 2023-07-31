package com.springboot.aprtment.winstonbackend.Controller;

import com.springboot.aprtment.winstonbackend.Entity.User;
import com.springboot.aprtment.winstonbackend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:3000/")
public class AdminController {
    @Autowired
    private UserService userService;

    @PostMapping("register")

    public User saveUser(@RequestBody User user){
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

//    @PutMapping ("/update/{id}")
//    public User updateUser(@RequestBody User newUser,@PathVariable Long id){
//        return userService.updateUser(id,newUser);
//    }
    @GetMapping("/user/{name}")
     public  User getByName(@PathVariable String name){
        return userService.findByName(name);
     }

}
