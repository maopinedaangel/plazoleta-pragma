package com.example.plazoleta.infrastructure.output.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "restaurante")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(length = 255)
    private String nombre;

    @Column(length = 255)
    private String direccion;

    @Column(length = 31)
    private String telefono;

    @Column(length = 255)
    private String ulrLogo;

    @Column(length = 31)
    private String nit;
}
