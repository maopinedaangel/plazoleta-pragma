package com.example.plazoleta.domain.api;

import com.example.plazoleta.domain.model.Restaurant;

import java.util.List;

public interface IRestaurantServicePort {

    void saveRestaurant(Restaurant restaurant);

    List<Restaurant> getAllRestaurants();
}
