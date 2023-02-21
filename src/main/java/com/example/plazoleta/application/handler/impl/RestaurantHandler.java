package com.example.plazoleta.application.handler.impl;

import com.example.plazoleta.application.dto.request.RestaurantRequestDto;
import com.example.plazoleta.application.dto.response.RestaurantResponseDto;
import com.example.plazoleta.application.handler.IRestaurantHandler;
import com.example.plazoleta.application.mapper.IRestaurantRequestMapper;
import com.example.plazoleta.application.mapper.IRestaurantResponseMapper;
import com.example.plazoleta.domain.api.IRestaurantServicePort;
import com.example.plazoleta.domain.model.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RestaurantHandler implements IRestaurantHandler {

    private final IRestaurantServicePort restaurantServicePort;
    private final IRestaurantRequestMapper restaurantRequestMapper;
    private final IRestaurantResponseMapper restaurantResponseMapper;

    @Override
    public void saveRestaurant(RestaurantRequestDto restaurantRequestDto) {
        Restaurant restaurant = restaurantRequestMapper.toRestaurant(restaurantRequestDto);
        restaurantServicePort.saveRestaurant(restaurant);
    }

    @Override
    public List<RestaurantResponseDto> getAllRestaurants() {
        return restaurantResponseMapper.toResponseList(restaurantServicePort.getAllRestaurants());
    }
}
