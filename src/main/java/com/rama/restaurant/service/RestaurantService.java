package com.rama.restaurant.service;

import com.rama.restaurant.entity.Restaurant;
import com.rama.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RestaurantService {
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Restaurant getRestaurantById(int id) throws Exception {
        return restaurantRepository.findById(id).orElseThrow(() -> new Exception("Restaurant not found with id: " + id));
    }

}
