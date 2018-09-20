package com.project.group5.ebuyApp.service;

import com.project.group5.ebuyApp.model.Bike;
import com.project.group5.ebuyApp.repository.BikeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Hashtable;
import java.util.List;

@Service
public class BikeService {

    Hashtable<String, Bike> bikes = new Hashtable<>();

    @Autowired
    private BikeDao bikeDao;

    public BikeService() {

        Bike bike1 = new Bike();
        bike1.setModel("Tesla");
        bike1.setDescription("Brand new tesla bike");

        bikes.put("1", bike1);

        Bike bike2 = new Bike();
        bike2.setModel("Ferari");
        bike2.setDescription("Brand new ferari bike");

        bikes.put("2", bike2);
    }

    public List<Bike> getAll() {
        return bikeDao.findAll();
    }

    public void addBike(Bike bike) {
        bikeDao.save(bike);
    }
}
