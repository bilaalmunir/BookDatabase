package com.bookstore.books.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bookstore.books.entity.Product;
import com.bookstore.books.services.ProductService;
// import org.springframework.web.bind.annotation.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@org.springframework.stereotype.Controller
@RestController
public class ProductController {
    @Autowired
    private ProductService service;


    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product) { 
        return service.saveProduct(product);
    }

    @PostMapping("/saveProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products){
        return service.saveProducts(products);
    }
    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }
}
