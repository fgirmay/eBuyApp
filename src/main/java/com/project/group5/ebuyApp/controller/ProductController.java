package com.project.group5.ebuyApp.controller;

import com.project.group5.ebuyApp.model.Product;
import com.project.group5.ebuyApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/all")
    public List<Product> getAll() {
        System.out.println("In products and all");
        return productService.getAll();
    }

    @RequestMapping(value = "/users/auth/{username}/{password}", method = RequestMethod.POST)
    public void authenticateUser(@PathVariable String username, @PathVariable String password) {
        System.out.println("User name is " + username + " and password is " + password) ;
    }

/*    @RequestMapping("/**")
    public List<Product> getAllProduct() {
        System.out.println("In products and all");
        return productService.getAll();
    }*/

    @RequestMapping("/{productId}")
    public Product getById(@PathVariable int productId) {
        //String id = String.valueOf(productId);
        return productService.getById(productId);
    }

    @RequestMapping("create")
    public void addProduct(){

        Product product1 = new Product();
        product1.setProductId(1);
        product1.setCategory("category1");
        product1.setTitle("title1");
        product1.setDescription("descript1");
        product1.setPrice(10);
        product1.setName("name1");
        product1.setEmail("email1");
        product1.setPhone("phone1");
        product1.setCity("city1");
        product1.setState("state1");
        product1.setImageUrl("imageUrl1");
        product1.setImageId("imageId1");
        product1.setDate("date1");

        productService.addProduct(product1);
    }

}
