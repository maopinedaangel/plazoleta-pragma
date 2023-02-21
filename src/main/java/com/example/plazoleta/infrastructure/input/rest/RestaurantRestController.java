package com.example.plazoleta.infrastructure.input.rest;

import com.example.plazoleta.application.dto.request.RestaurantRequestDto;
import com.example.plazoleta.application.dto.response.RestaurantResponseDto;
import com.example.plazoleta.application.handler.IRestaurantHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/restaurante")
@RequiredArgsConstructor
public class RestaurantRestController {

    private final IRestaurantHandler restaurantHandler;

    @Operation(summary = "Agregar un nuevo restaurante")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Restaurante creado", content = @Content),
            @ApiResponse(responseCode = "409", description = "El restaurante ya existe", content = @Content)
    })
    @PostMapping("/")
    public ResponseEntity<Void>saveRestaurante(@RequestBody RestaurantRequestDto restaurantRequestDto) {
        restaurantHandler.saveRestaurant(restaurantRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Operation(summary = "Obtener todos los restaurantes")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Listar todos los restaurantes",
                    content = @Content(mediaType = "application/json",
                            array = @ArraySchema(schema = @Schema(implementation = RestaurantResponseDto.class)))),
            @ApiResponse(responseCode = "404", description = "No se encontraron datos", content = @Content)
    })
    @GetMapping("/")
    public ResponseEntity<List<RestaurantResponseDto>> getAllRestaurants() {
        return ResponseEntity.ok(restaurantHandler.getAllRestaurants());
    }
}
