package com.project.group5.ebuyApp.service;

import com.project.group5.ebuyApp.model.Address;
import com.project.group5.ebuyApp.model.Customer;
import com.project.group5.ebuyApp.model.Image;
import com.project.group5.ebuyApp.model.Product;
import com.project.group5.ebuyApp.repository.ProductDTO;
import com.project.group5.ebuyApp.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Transactional
public class ProductService {

    private List<Product> products = new ArrayList<>();

    @Autowired
    private ProductDao productDao;

    public ProductService() {
        //initializeProducts();

    }

    public List<Product> getAll() {
        return productDao.findAll();
    }

    public int findProduct(String category, String description, String imageUrl) {

        Product product = productDao.findByCategoryAndDescriptionAndByImageUrl(imageUrl);

        return product.getId();
    }

    public void deleteProduct(int productId) {

        Product product = productDao.findById(productId).get();
        productDao.delete(product);
    }

    public Product getById(int productId) {
        //return productDao.findById(productId).get();
        return products.get(productId);
    }

    public List<ProductDTO> getAllByCategory(String category) {

        List<Product> products = productDao.findByCategory(category);
        List<ProductDTO> productDTOS = createProductDTOS(products);

        return productDTOS;
    }

    public void addProduct(Product product) {
        productDao.save(product);
    }

    public List<ProductDTO> createProductDTOS(List<Product> products) {

        List<ProductDTO> productDTOS = new ArrayList<>();

        for (Product product : products) {

            ProductDTO productDTO = new ProductDTO();
            productDTO.setProductId(product.getId());
            productDTO.setCategory(product.getCategory());
            productDTO.setTitle(product.getTitle());
            productDTO.setDescription(product.getDescription());
            productDTO.setPrice(product.getPrice());
            productDTO.setDatePosted(product.getDatePosted().toString());

            productDTO.setName(product.getCustomer().getName());
            productDTO.setEmail(product.getCustomer().getEmail());
            productDTO.setPhone(product.getCustomer().getPhoneNumber());
            productDTO.setCity(product.getCustomer().getAddress().getCity());
            productDTO.setState(product.getCustomer().getAddress().getState());
            productDTO.setImageId(String.valueOf(product.getImage().getId()));
            productDTO.setImageUrl(product.getImage().getImageUrl());

            productDTOS.add(productDTO);
        }

        return productDTOS;
    }

    public Product createProduct(ProductDTO productDTO) {

        Address address = new Address(productDTO.getCity(), productDTO.getState());
        String name = productDTO.getName();
        String phone = productDTO.getPhone();
        String email = productDTO.getEmail();
        Customer customer = new Customer(name, phone, email, address);

        Product product = new Product();
        String category = productDTO.getCategory();
        String title = productDTO.getTitle();
        String description = productDTO.getDescription();
        double price = productDTO.getPrice();

        String imageUrl = productDTO.getImageUrl();

        System.out.println("Inside ProductService : the image url is " + imageUrl);

        Image image = new Image(imageUrl);
        image.setImageData(productDTO.getImage());

        String datePosted = productDTO.getDatePosted();

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = null;


        try {
            date = simpleDateFormat.parse(datePosted);

        } catch (ParseException e) {

            System.out.println("Is there anything wrong with the date?");

            e.printStackTrace();
        }

        product.setCategory(category);
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setDatePosted(date);
        product.setCustomer(customer);
        product.setImage(image);

        return product;

    }
}
