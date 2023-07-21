package com.bookstore.books.repository;

import com.bookstore.books.entity.Product;
import com.bookstore.books.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    

}
