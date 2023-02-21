package com.example.plazoleta.application.handler;

import com.example.plazoleta.application.dto.request.RestaurantRequestDto;
import com.example.plazoleta.application.dto.response.RestaurantResponseDto;

import java.util.List;

public interface IRestaurantHandler {
    void saveRestaurant(RestaurantRequestDto restaurantRequestDto);
    List<RestaurantResponseDto> getAllRestaurants();
}
