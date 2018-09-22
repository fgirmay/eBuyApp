package com.project.group5.ebuyApp.repository;

public class ProductDTO {

    private int productId;
    private String category;
    private String title;
    private String description;
    private double price;
    private String name;
    private String email;
    private String phone;
    private String city;
    private String state;
    private String imageUrl;
    private String imageId;
    private String datePosted;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    @Override
    public String toString() {

        /*private int productId;
        private String category;
        private String title;
        private String description;
        private double price;
        private String name;
        private String email;
        private String phone;
        private String city;
        private String state;
        private String imageUrl;
        private String imageId;
        private String datePosted;*/

        return "Category :" + category + ", title : " + title + ", description : " + description + ", price : " + price +
                ", name : " + name + ", email : " + email + ", phone : " + phone + ", city : " + city + ", state :" + state +
                ", imageUrl : " + imageUrl + ", imageId : " + imageId + ", datePosted : " + datePosted;


    }
}
