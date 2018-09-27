package com.project.group5.ebuyApp.repository;

import com.project.group5.ebuyApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {

    public List<Product> findByCategory(String category);

    @Query("select distinct p from Product p where  p.image.imageUrl = ?1")
    public Product findByCategoryAndDescriptionAndByImageUrl(String imageUrl);
}
