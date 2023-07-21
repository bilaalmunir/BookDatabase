package com.bookstore.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.books.entity.User;
import com.bookstore.books.services.UserService;

@org.springframework.stereotype.Controller
@RestController
public class UserController {
    @Autowired
    private UserService service;
    
    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        System.out.println(user.toString());
        return service.saveUser(user);

    //     ModelAndView modelAndView = new ModelAndView();
    //     modelAndView.setViewName("success.html");
    // return modelAndView;
    }
    @GetMapping("/getUserById/{id}")
    public User getUserById(int id){
        return service.getUserById(id);
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user ){
        return service.updateUser(user);
    }
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }
}
