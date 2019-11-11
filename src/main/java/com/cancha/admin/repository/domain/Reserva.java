package com.cancha.admin.repository.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Getter
@Setter
public class Reserva {
    @Id
    private String idReserva;
    private Date fechaReserva;
    @DBRef
    private Persona persona;
    @DBRef
    private Cancha cancha;

}
