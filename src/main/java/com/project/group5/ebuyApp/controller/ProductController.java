package com.project.group5.ebuyApp.controller;

import com.project.group5.ebuyApp.model.Address;
import com.project.group5.ebuyApp.model.Customer;
import com.project.group5.ebuyApp.model.Product;
import com.project.group5.ebuyApp.repository.ProductDTO;
import com.project.group5.ebuyApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/all")
    public List<ProductDTO> getAll() {

        System.out.println("In products and all");
        List<Product> products = productService.getAll();

        List<ProductDTO> productDTOS = productService.createProductDTOS(products);

        return productDTOS;
    }

    @RequestMapping("/countImages/{productId}")
    public String countImages(@PathVariable int productId) {

        System.out.println("The product id is " + productId);
        return "1";
    }

    @RequestMapping(value = "/users/auth/{username}/{password}", method = RequestMethod.POST)
    public void authenticateUser(@PathVariable String username, @PathVariable String password) {
        System.out.println("User name is " + username + " and password is " + password) ;
    }

    @RequestMapping("/{productId}")
    public Product getById(@PathVariable int productId) {
        //String id = String.valueOf(productId);
        return productService.getById(productId);
    }

    @PostMapping("/products")
    public Product newProduct(@RequestBody ProductDTO newProductDTO) {

        System.out.println("Wow, adding new product after very long time!!!");

        System.out.println("ProductDTO info is " + newProductDTO);

        Product product = productService.createProduct(newProductDTO);

        productService.addProduct(product);

        return product;
    }

    @RequestMapping("create")
    public void createProduct(){

        Address address1 = new Address("Fairfield", "Iowa");
        Customer customer1 = new Customer("Fissehaye", "0912659563", "fissehaye@gmail.com", address1);

        Product product1 = new Product();
        product1.setCategory("category1");
        product1.setTitle("title1");
        product1.setDescription("descript1");
        product1.setPrice(10);
        product1.setImageUrl("imageUrl1");
        product1.setImageId("imageId1");
        product1.setDatePosted(new Date());

        product1.setCustomer(customer1);

        productService.addProduct(product1);
    }

}
