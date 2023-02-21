package com.example.plazoleta.application.mapper;

import com.example.plazoleta.application.dto.response.RestaurantResponseDto;
import com.example.plazoleta.domain.model.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestaurantResponseMapper {
    RestaurantResponseDto toResponse(Restaurant restaurant);
    List<RestaurantResponseDto> toResponseList(List<Restaurant> restaurantList);
}
