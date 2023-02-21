package com.example.plazoleta.infrastructure.configuration;

import com.example.plazoleta.domain.api.IRestaurantServicePort;
import com.example.plazoleta.domain.spi.IRestaurantPersistancePort;
import com.example.plazoleta.domain.usecase.RestaurantUseCase;
import com.example.plazoleta.infrastructure.output.jpa.adapter.RestaurantJpaAdapter;
import com.example.plazoleta.infrastructure.output.jpa.mapper.IRestaurantEntityMapper;
import com.example.plazoleta.infrastructure.output.jpa.repository.IRestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {
    private final IRestaurantRepository restauranteRepository;
    private final IRestaurantEntityMapper restauranteEntityMapper;

    @Bean
    public IRestaurantPersistancePort restaurantePersistancePort() {
        return new RestaurantJpaAdapter(restauranteRepository, restauranteEntityMapper);
    }

    @Bean
    public IRestaurantServicePort restauranteServicePort() {
        return new RestaurantUseCase(restaurantePersistancePort());
    }
}
