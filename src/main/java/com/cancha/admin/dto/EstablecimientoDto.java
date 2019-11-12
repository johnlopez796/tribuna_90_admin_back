package com.cancha.admin.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EstablecimientoDto {
    private String id;
    private String nombre;
    private String ubicacion;
    private String horaApertura;
    private String horaCierre;
    private int numeroCanchas;
    private List<CanchaDto> canchas;
}