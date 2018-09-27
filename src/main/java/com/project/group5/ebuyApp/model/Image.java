package com.project.group5.ebuyApp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String imageUrl;
    @Lob
    private byte[] imageData;

    public Image(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Image(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
}
