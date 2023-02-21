package com.example.plazoleta.domain.usecase;

import com.example.plazoleta.domain.api.IRestaurantServicePort;
import com.example.plazoleta.domain.model.Restaurant;
import com.example.plazoleta.domain.spi.IRestaurantPersistancePort;

import java.util.List;

public class RestaurantUseCase implements IRestaurantServicePort {

    private final IRestaurantPersistancePort restaurantePersistancePort;

    public RestaurantUseCase(IRestaurantPersistancePort restaurantePersistancePort) {
        this.restaurantePersistancePort = restaurantePersistancePort;
    }

    @Override
    public void saveRestaurant(Restaurant restaurant) {
        restaurantePersistancePort.saveRestaurant(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantePersistancePort.getAllRestaurants();
    }
}
