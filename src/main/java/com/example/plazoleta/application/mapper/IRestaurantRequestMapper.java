package com.example.plazoleta.application.mapper;

import com.example.plazoleta.application.dto.request.RestaurantRequestDto;
import com.example.plazoleta.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantRequestMapper {
    Restaurant toRestaurant(RestaurantRequestDto restaurantRequestDto);
}
