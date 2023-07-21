package com.bookstore.books.services;

import com.bookstore.books.entity.Product;
import com.bookstore.books.repository.ProductRepository;

import jakarta.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
//dependancies check kareingay
//builtin functions deti hai repository ab ham usko use karnay lagay hein

//return type product rakh rhay heiun kiun k joh object save hota hai repository wohi return krti hai
public class ProductService {
    @Autowired //inject kar di 
    private ProductRepository repository;
    public Product saveProduct(Product productName){
        return repository.save(productName);
    }
    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }
    public List<Product> getProducts(){
        return repository.findAll();
    }
    public Product getProductById(int Id){
        return repository.findById(Id).orElse(null);
    }
    public Product updateProduct(Product product){
        Product existingProduct= repository.findById((product.getId())).orElse(null);
        existingProduct.setBookname(product.getBookname());
        return repository.save(existingProduct);
    }
    public String deleteProduct(int id){
        repository.deleteById(id);
        return "removed";
    }

}


