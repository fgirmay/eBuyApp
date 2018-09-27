package com.project.group5.ebuyApp.controller;

import com.project.group5.ebuyApp.model.Address;
import com.project.group5.ebuyApp.model.Customer;
import com.project.group5.ebuyApp.model.Image;
import com.project.group5.ebuyApp.model.Product;
import com.project.group5.ebuyApp.repository.ProductDTO;
import com.project.group5.ebuyApp.repository.ProductInfo;
import com.project.group5.ebuyApp.service.ImageService;
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

    @Autowired
    private ImageService imageService;

    @RequestMapping("/all")
    public List<ProductDTO> getAll() {

        System.out.println("In products and all");
        List<Product> products = productService.getAll();

        List<ProductDTO> productDTOS = productService.createProductDTOS(products);

        return productDTOS;
    }

    @RequestMapping("/getByCategory")
    public List<ProductDTO> getAllByCategory(@RequestParam String category) {

        System.out.println("The category is " + category);
        List<ProductDTO> productDTOS = productService.getAllByCategory(category);
        return productDTOS;
    }

    @RequestMapping(value = "/deleteProducts", method = RequestMethod.POST)
    public void deleteProduct(@RequestBody ProductInfo productInfo) {

        String category = productInfo.getCategory();
        String description = productInfo.getDescription();
        String imageUrl = productInfo.getImageUrl();

        int productId = productService.findProduct(category, description, imageUrl);

        productService.deleteProduct(productId);

        System.out.println("The category is " + productInfo.getCategory());
        System.out.println("The description is " + productInfo.getDescription());
        System.out.println("The imageUrl is " + productInfo.getImageUrl());

        //productService.deleteProduct(productId);
    }

    @RequestMapping("/countImages/{productId}")
    public String countImages(@PathVariable int productId) {

        System.out.println("The product id is " + productId);
        return String.valueOf(productId);
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

        System.out.println("Adding a new product!!!");

        String category = newProductDTO.getCategory();

        System.out.println("The category is " + category);

        String imageUrl = imageService.setUpImageUrl(category);
        newProductDTO.setImageUrl(imageUrl);

        System.out.println("ProductDTO info is " + newProductDTO);

        Product product = productService.createProduct(newProductDTO);

        productService.addProduct(product);

        return product;
    }

    @RequestMapping("create")
    public void createProduct(){

        Address address1 = new Address("Fairfield", "Iowa");
        Image image = new Image("http://www.bikesdirect.com/products/motobecane/city-bikes/bistro3-blue-men-5.jpg");
        Customer customer1 = new Customer("Fissehaye", "0912659563", "fissehaye@gmail.com", address1);

        Product product1 = new Product();
        product1.setCategory("category1");
        product1.setTitle("title1");
        product1.setDescription("descript1");
        product1.setPrice(10);
        product1.setDatePosted(new Date());

        product1.setCustomer(customer1);
        product1.setImage(image);

        productService.addProduct(product1);
    }

}
