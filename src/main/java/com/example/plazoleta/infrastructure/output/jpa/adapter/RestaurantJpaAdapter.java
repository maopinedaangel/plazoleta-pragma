package com.example.plazoleta.infrastructure.output.jpa.adapter;

import com.example.plazoleta.domain.model.Restaurant;
import com.example.plazoleta.domain.spi.IRestaurantPersistancePort;
import com.example.plazoleta.infrastructure.exception.NoDataFoundException;
import com.example.plazoleta.infrastructure.output.jpa.entity.RestaurantEntity;
import com.example.plazoleta.infrastructure.output.jpa.mapper.IRestaurantEntityMapper;
import com.example.plazoleta.infrastructure.output.jpa.repository.IRestaurantRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RestaurantJpaAdapter implements IRestaurantPersistancePort {

    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantEntityMapper restaurantEntityMapper;

    @Override
    public Restaurant saveRestaurant(Restaurant restaurant) {
        RestaurantEntity restaurantEntity = restaurantRepository.save(restaurantEntityMapper.toEntity(restaurant));
        return restaurantEntityMapper.toRestaurantModel(restaurantEntity);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        List<RestaurantEntity> entityList = restaurantRepository.findAll();
        if (entityList.isEmpty()) {
            throw new NoDataFoundException();
        }
        return restaurantEntityMapper.toRestaurantModelList(entityList);
    }
}
