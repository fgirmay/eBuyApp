package com.project.group5.ebuyApp.service;

import com.project.group5.ebuyApp.model.Product;
import com.project.group5.ebuyApp.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Service
public class ProductService {

    //private Hashtable<Long, Product> products = new Hashtable<>();
    private List<Product> products = new ArrayList<>();

    @Autowired
    private ProductDao productDao;

    public ProductService() {

        /*Product product1 = new Product();
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
        product1.setImageUrl("https://via.placeholder.com/600/");
        product1.setImageId("92c952");
        product1.setDate("date1");
        products.put(1L,product1);

        Product product2 = new Product();
        product2.setProductId(2);
        product2.setCategory("category2");
        product2.setTitle("title2");
        product2.setDescription("descript2");
        product2.setPrice(10);
        product2.setName("name2");
        product2.setEmail("email2");
        product2.setPhone("phone2");
        product2.setCity("city2");
        product2.setState("state2");
        product2.setImageUrl("https://via.placeholder.com/600/");
        product2.setImageId("92c952");
        product2.setDate("date2");
        products.put(2L,product2);

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setCategory("category3");
        product3.setTitle("title3");
        product3.setDescription("descript3");
        product3.setPrice(10);
        product3.setName("name3");
        product3.setEmail("email3");
        product3.setPhone("phone3");
        product3.setCity("city3");
        product3.setState("state3");
        product3.setImageUrl("https://via.placeholder.com/600/");
        product3.setImageId("92c952");
        product3.setDate("date3");
        products.put(3L,product3);

        Product product4 = new Product();
        product4.setProductId(4);
        product4.setCategory("category4");
        product4.setTitle("title4");
        product4.setDescription("descript4");
        product4.setPrice(10);
        product4.setName("name4");
        product4.setEmail("email4");
        product4.setPhone("phone4");
        product4.setCity("city4");
        product4.setState("state4");
        product4.setImageUrl("https://via.placeholder.com/600/");
        product4.setImageId("92c952");
        product4.setDate("date4");
        products.put(4L,product3);

        Product product5 = new Product();
        product5.setProductId(5);
        product5.setCategory("category5");
        product5.setTitle("title5");
        product5.setDescription("descript5");
        product5.setPrice(10);
        product5.setName("name5");
        product5.setEmail("email5");
        product5.setPhone("phone5");
        product5.setCity("city5");
        product5.setState("state5");
        product5.setImageUrl("https://via.placeholder.com/600/");
        product5.setImageId("92c952");
        product5.setDate("date5");
        products.put(5L,product5);

        Product product6 = new Product();
        product6.setProductId(6);
        product6.setCategory("category6");
        product6.setTitle("title6");
        product6.setDescription("descript6");
        product6.setPrice(10);
        product6.setName("name6");
        product6.setEmail("email6");
        product6.setPhone("phone6");
        product6.setCity("city6");
        product6.setState("state6");
        product6.setImageUrl("https://via.placeholder.com/600/");
        product6.setImageId("92c952");
        product6.setDate("date6");
        products.put(6L,product6);

        Product product7 = new Product();
        product7.setProductId(7);
        product7.setCategory("category7");
        product7.setTitle("title7");
        product7.setDescription("descript7");
        product7.setPrice(10);
        product7.setName("name7");
        product7.setEmail("email7");
        product7.setPhone("phone7");
        product7.setCity("city7");
        product7.setState("state7");
        product7.setImageUrl("https://via.placeholder.com/600/");
        product7.setImageId("92c952");
        product7.setDate("date7");
        products.put(7L,product7);

        Product product8 = new Product();
        product8.setProductId(8);
        product8.setCategory("category8");
        product8.setTitle("title8");
        product8.setDescription("descript8");
        product8.setPrice(10);
        product8.setName("name8");
        product8.setEmail("email8");
        product8.setPhone("phone8");
        product8.setCity("city8");
        product8.setState("state8");
        product8.setImageUrl("https://via.placeholder.com/600/");
        product8.setImageId("92c952");
        product8.setDate("date8");
        products.put(8L,product8);

        Product product9 = new Product();
        product9.setProductId(9);
        product9.setCategory("category9");
        product9.setTitle("title9");
        product9.setDescription("descript9");
        product9.setPrice(10);
        product9.setName("name9");
        product9.setEmail("email9");
        product9.setPhone("phone9");
        product9.setCity("city9");
        product9.setState("state9");
        product9.setImageUrl("https://via.placeholder.com/600/");
        product9.setImageId("92c952");
        product9.setDate("date9");
        products.put(9L,product9);

        Product product10 = new Product();
        product10.setProductId(10);
        product10.setCategory("category10");
        product10.setTitle("title10");
        product10.setDescription("descript10");
        product10.setPrice(10);
        product10.setName("name10");
        product10.setEmail("email10");
        product10.setPhone("phone10");
        product10.setCity("city10");
        product10.setState("state10");
        product10.setImageUrl("https://via.placeholder.com/600/");
        product10.setImageId("92c952");
        product10.setDate("date10");
        products.put(10L,product10);*/
        initializeProducts();

    }

    private void initializeProducts() {
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
        product1.setImageUrl("https://via.placeholder.com/600/");
        product1.setImageId("92c952");
        product1.setDate("date1");
        products.add(product1);

        Product product2 = new Product();
        product2.setProductId(2);
        product2.setCategory("category2");
        product2.setTitle("title2");
        product2.setDescription("descript2");
        product2.setPrice(10);
        product2.setName("name2");
        product2.setEmail("email2");
        product2.setPhone("phone2");
        product2.setCity("city2");
        product2.setState("state2");
        product2.setImageUrl("https://via.placeholder.com/600/");
        product2.setImageId("92c952");
        product2.setDate("date2");
        products.add(product2);

        Product product3 = new Product();
        product3.setProductId(3);
        product3.setCategory("category3");
        product3.setTitle("title3");
        product3.setDescription("descript3");
        product3.setPrice(10);
        product3.setName("name3");
        product3.setEmail("email3");
        product3.setPhone("phone3");
        product3.setCity("city3");
        product3.setState("state3");
        product3.setImageUrl("https://via.placeholder.com/600/");
        product3.setImageId("92c952");
        product3.setDate("date3");
        products.add(product3);

        Product product4 = new Product();
        product4.setProductId(4);
        product4.setCategory("category4");
        product4.setTitle("title4");
        product4.setDescription("descript4");
        product4.setPrice(10);
        product4.setName("name4");
        product4.setEmail("email4");
        product4.setPhone("phone4");
        product4.setCity("city4");
        product4.setState("state4");
        product4.setImageUrl("https://via.placeholder.com/600/");
        product4.setImageId("92c952");
        product4.setDate("date4");
        products.add(product3);

        Product product5 = new Product();
        product5.setProductId(5);
        product5.setCategory("category5");
        product5.setTitle("title5");
        product5.setDescription("descript5");
        product5.setPrice(10);
        product5.setName("name5");
        product5.setEmail("email5");
        product5.setPhone("phone5");
        product5.setCity("city5");
        product5.setState("state5");
        product5.setImageUrl("https://via.placeholder.com/600/");
        product5.setImageId("92c952");
        product5.setDate("date5");
        products.add(product5);

        Product product6 = new Product();
        product6.setProductId(6);
        product6.setCategory("category6");
        product6.setTitle("title6");
        product6.setDescription("descript6");
        product6.setPrice(10);
        product6.setName("name6");
        product6.setEmail("email6");
        product6.setPhone("phone6");
        product6.setCity("city6");
        product6.setState("state6");
        product6.setImageUrl("https://via.placeholder.com/600/");
        product6.setImageId("92c952");
        product6.setDate("date6");
        products.add(product6);

        Product product7 = new Product();
        product7.setProductId(7);
        product7.setCategory("category7");
        product7.setTitle("title7");
        product7.setDescription("descript7");
        product7.setPrice(10);
        product7.setName("name7");
        product7.setEmail("email7");
        product7.setPhone("phone7");
        product7.setCity("city7");
        product7.setState("state7");
        product7.setImageUrl("https://via.placeholder.com/600/");
        product7.setImageId("92c952");
        product7.setDate("date7");
        products.add(product7);

        Product product8 = new Product();
        product8.setProductId(8);
        product8.setCategory("category8");
        product8.setTitle("title8");
        product8.setDescription("descript8");
        product8.setPrice(10);
        product8.setName("name8");
        product8.setEmail("email8");
        product8.setPhone("phone8");
        product8.setCity("city8");
        product8.setState("state8");
        product8.setImageUrl("https://via.placeholder.com/600/");
        product8.setImageId("92c952");
        product8.setDate("date8");
        products.add(product8);

        Product product9 = new Product();
        product9.setProductId(9);
        product9.setCategory("category9");
        product9.setTitle("title9");
        product9.setDescription("descript9");
        product9.setPrice(10);
        product9.setName("name9");
        product9.setEmail("email9");
        product9.setPhone("phone9");
        product9.setCity("city9");
        product9.setState("state9");
        product9.setImageUrl("https://via.placeholder.com/600/");
        product9.setImageId("92c952");
        product9.setDate("date9");
        products.add(product9);

        Product product10 = new Product();
        product10.setProductId(10);
        product10.setCategory("category10");
        product10.setTitle("title10");
        product10.setDescription("descript10");
        product10.setPrice(10);
        product10.setName("name10");
        product10.setEmail("email10");
        product10.setPhone("phone10");
        product10.setCity("city10");
        product10.setState("state10");
        product10.setImageUrl("https://via.placeholder.com/600/");
        product10.setImageId("92c952");
        product10.setDate("date10");
        products.add(product10);
    }

    public List<Product> getAll() {
        //return productDao.findAll();
        return products;
    }

    public Product getById(int productId) {
        //return productDao.findById(productId).get();
        return products.get(productId);
    }

    public void addProduct(Product product) {
        productDao.save(product);
    }
}
