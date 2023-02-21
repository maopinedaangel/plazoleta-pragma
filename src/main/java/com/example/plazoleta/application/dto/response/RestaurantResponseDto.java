package com.example.plazoleta.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestaurantResponseDto {
    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String ulrLogo;
    private String nit;
}
