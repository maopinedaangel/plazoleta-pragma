package com.example.plazoleta.infrastructure.output.jpa.mapper;

import com.example.plazoleta.domain.model.Restaurant;
import com.example.plazoleta.infrastructure.output.jpa.entity.RestaurantEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IRestaurantEntityMapper {
    RestaurantEntity toEntity(Restaurant restaurant);
    Restaurant toRestaurantModel(RestaurantEntity restaurantEntity);
    List<Restaurant> toRestaurantModelList(List<RestaurantEntity> restaurantEntityList);

}
