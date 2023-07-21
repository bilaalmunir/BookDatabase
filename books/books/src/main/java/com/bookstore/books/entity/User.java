package com.bookstore.books.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User_Data")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name = "Phone_No")
private int number;
@Column(name = "User_Name")
private String username;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getNumber() {
    return number;
}
public void setNumber(int number) {
    this.number = number;
}
public String getUsername() {
    return username;
}
public void setUsername(String username) {
    this.username = username;
}
@Override
public String toString() {
    return "User [id=" + id + ", number=" + number + ", username=" + username + "]";
}


    
}
