package com.bookstore.books.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//book details 
@Entity
@Table(name="BOOKS")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String bookname;
    private String Author;
    private String details;
    
public int getId() {
    return Id;
}
public void setId(int id) {
    Id = id;
}
public String getBookname() {
    return bookname;
}
public void setBookname(String bookname) {
    this.bookname = bookname;
}
public String getAuthor() {
    return Author;
}
public void setAuthor(String author) {
    Author = author;
}
public String getDetails() {
    return details;
}
public void setDetails(String details) {
    this.details = details;
}
}
