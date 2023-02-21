package com.example.plazoleta.domain.spi;

import com.example.plazoleta.domain.model.Restaurant;

import java.util.List;

public interface IRestaurantPersistancePort {
    Restaurant saveRestaurant(Restaurant restaurant);

    List<Restaurant> getAllRestaurants();
}
