package com.project.group5.ebuyApp.service;

import com.project.group5.ebuyApp.model.Address;
import com.project.group5.ebuyApp.model.Customer;
import com.project.group5.ebuyApp.model.Product;
import com.project.group5.ebuyApp.repository.ProductDTO;
import com.project.group5.ebuyApp.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    @Autowired
    private ProductDao productDao;

    public ProductService() {
        initializeProducts();

    }

    private void initializeProducts() {
        Product product1 = new Product();
        product1.setProductId(1);
        product1.setCategory("category1");
        product1.setTitle("title1");
        product1.setDescription("descript1");
        product1.setPrice(10);
/*        product1.setName("name1");
        product1.setEmail("email1");
        product1.setPhone("0912659563");*/
        product1.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product1.setImageId("92c952");
        product1.setDatePosted(new Date());
        products.add(product1);

        Product product2 = new Product();
        product2.setProductId(2);
        product2.setCategory("category2");
        product2.setTitle("title2");
        product2.setDescription("descript2");
        product2.setPrice(10);
/*        product2.setName("name2");
        product2.setEmail("email2");
        product2.setPhone("0912659563");*/
        product2.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product2.setImageId("92c952");
        product2.setDatePosted(new Date());
        products.add(product2);

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setCategory("category3");
        product3.setTitle("title3");
        product3.setDescription("descript3");
        product3.setPrice(10);
        /*product3.setName("name3");
        product3.setEmail("email3");
        product3.setPhone("0912659563");*/
        product3.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product3.setImageId("92c952");
        product3.setDatePosted(new Date());
        products.add(product3);

        Product product4 = new Product();
        product4.setProductId(4);
        product4.setCategory("category4");
        product4.setTitle("title4");
        product4.setDescription("descript4");
        product4.setPrice(10);
        /*product4.setName("name4");
        product4.setEmail("email4");
        product4.setPhone("0912659563");*/
        product4.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product4.setImageId("92c952");
        product4.setDatePosted(new Date());
        products.add(product4);

        Product product5 = new Product();
        product5.setProductId(5);
        product5.setCategory("category5");
        product5.setTitle("title5");
        product5.setDescription("descript5");
        product5.setPrice(10);
        /*product5.setName("name5");
        product5.setEmail("email5");
        product5.setPhone("0912659563");*/
        product5.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product5.setImageId("92c952");
        product5.setDatePosted(new Date());
        products.add(product5);

        Product product6 = new Product();
        product6.setProductId(6);
        product6.setCategory("category6");
        product6.setTitle("title6");
        product6.setDescription("descript6");
        product6.setPrice(10);
        /*product6.setName("name6");
        product6.setEmail("email6");
        product6.setPhone("0912659563");*/
        product6.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product6.setImageId("92c952");
        product6.setDatePosted(new Date());
        products.add(product6);

        Product product7 = new Product();
        product7.setProductId(7);
        product7.setCategory("category7");
        product7.setTitle("title7");
        product7.setDescription("descript7");
        product7.setPrice(10);
        /*product7.setName("name7");
        product7.setEmail("email7");
        product7.setPhone("0912659563");*/
        product7.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product7.setImageId("92c952");
        product7.setDatePosted(new Date());
        products.add(product7);

        Product product8 = new Product();
        product8.setProductId(8);
        product8.setCategory("category8");
        product8.setTitle("title8");
        product8.setDescription("descript8");
        product8.setPrice(10);
        /*product8.setName("name8");
        product8.setEmail("email8");
        product8.setPhone("0912659563");*/
        product8.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product8.setImageId("92c952");
        product8.setDatePosted(new Date());
        products.add(product8);

        Product product9 = new Product();
        product9.setProductId(9);
        product9.setCategory("category9");
        product9.setTitle("title9");
        product9.setDescription("descript9");
        product9.setPrice(10);
        /*product9.setName("name9");
        product9.setEmail("email9");
        product9.setPhone("0912659563");*/
        product9.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product9.setImageId("92c952");
        product9.setDatePosted(new Date());
        products.add(product9);

        Product product10 = new Product();
        product10.setProductId(10);
        product10.setCategory("category10");
        product10.setTitle("title10");
        product10.setDescription("descript10");
        product10.setPrice(10);
        /*product10.setName("name10");
        product10.setEmail("email10");
        product10.setPhone("0912659563");*/
        product10.setImageUrl("https://apod.nasa.gov/apod/image/0604/M81_M82_schedler_c25.jpg");
        product10.setImageId("92c952");
        product10.setDatePosted(new Date());
        products.add(product10);
    }

    public List<Product> getAll() {
        return productDao.findAll();
        //return products;
    }

    public Product getById(int productId) {
        //return productDao.findById(productId).get();
        return products.get(productId);
    }

    public void addProduct(Product product) {
        productDao.save(product);
    }

    public List<ProductDTO> createProductDTOS(List<Product> products) {

        List<ProductDTO> productDTOS = new ArrayList<>();
        ProductDTO productDTO = new ProductDTO();

        for (Product product : products) {
            productDTO.setProductId(product.getProductId());
            productDTO.setCategory(product.getCategory());
            productDTO.setTitle(product.getTitle());
            productDTO.setDescription(product.getDescription());
            productDTO.setPrice(product.getPrice());
            productDTO.setImageUrl(product.getImageUrl());
            productDTO.setImageId(product.getImageId());
            productDTO.setDatePosted(product.getDatePosted().toString());

            //if (product.getCustomer() != null) {
                productDTO.setName(product.getCustomer().getName());
                productDTO.setEmail(product.getCustomer().getEmail());
                productDTO.setPhone(product.getCustomer().getPhoneNumber());
                productDTO.setCity(product.getCustomer().getAddress().getCity());
                productDTO.setState(product.getCustomer().getAddress().getState());
            //}

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
        String imageId = productDTO.getImageId();
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
        product.setImageUrl(imageUrl);
        product.setImageId(imageId);
        product.setDatePosted(date);
        product.setCustomer(customer);

        return product;

    }
}
