package com.project.group5.ebuyApp.service;

import org.springframework.stereotype.Service;

@Service
public class ImageService {

    public String setUpImageUrl(String category){

        String imageUrl = null;

        switch (category) {
            case "Bike":
                imageUrl = "http://www.bikesdirect.com/products/motobecane/city-bikes/bistro3-blue-men-5.jpg";
                break;

            case "Electronics":
                imageUrl = "https://www.jbklutse.com/wp-content/uploads/2018/07/iphone.jpg";
                break;

            case "Laptops":
                imageUrl = "https://9to5mac.com/wp-content/uploads/sites/6/2018/03/apple-13-inch-macbook-air.jpg";
                break;

            case "Vehicles":
                imageUrl = "https://amp.businessinsider.com/images/550c6d0c6da8118d60b5030a-750-562.jpg";
                break;

            case "Refrigerator":
                imageUrl = "https://cdn.mos.cms.futurecdn.net/D9cP8UdHbh3ARPaMpH4spS-768-80.jpg";
                break;

            default:
                imageUrl = "http://www.bikesdirect.com/products/motobecane/city-bikes/bistro3-blue-men-5.jpg";
                break;
        }

        return imageUrl;
    }
}
