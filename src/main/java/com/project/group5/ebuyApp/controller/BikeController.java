package com.project.group5.ebuyApp.controller;

import com.project.group5.ebuyApp.model.Bike;
import com.project.group5.ebuyApp.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bikes")
public class BikeController {

    @Autowired
    private BikeService bikeService;

    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/all")
    public List<Bike> getAll() {
        return bikeService.getAll();
    }

    @RequestMapping("create")
    public void addBike(){

        Bike bike = new Bike();
        bike.setModel("Tesla2");
        bike.setDescription("Brand new tesla bike2");

        bikeService.addBike(bike);
    }
}
