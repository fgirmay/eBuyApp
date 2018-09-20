package com.project.group5.ebuyApp.repository;

import com.project.group5.ebuyApp.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeDao extends JpaRepository<Bike, Long> {
}
