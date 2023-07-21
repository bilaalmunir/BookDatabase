package com.bookstore.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.books.entity.User;
import com.bookstore.books.repository.UserRepository;
 @Service
public class UserService {
   @Autowired
   private UserRepository repository;
   //post
   public User saveUser(User user){
    return repository.save(user);
   }
    //get
   public User getUserById(int id){
    return repository.findById(id).orElse(null);
   }
   //delete
   public String deleteUser(int id){
    repository.deleteById(id);
    return "User deleted";
   }
   //put
   public User updateUser(User user){
    User oldUser = repository.findById(user.getId()).orElse(null);
    oldUser.setNumber(user.getNumber());
    oldUser.setUsername(user.getUsername());
    return repository.save(oldUser);
   }
}
