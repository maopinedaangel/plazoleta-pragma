package com.example.plazoleta.infrastructure.output.jpa.repository;

import com.example.plazoleta.infrastructure.output.jpa.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<RestaurantEntity, Integer> {
}
