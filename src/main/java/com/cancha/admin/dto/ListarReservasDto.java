package com.cancha.admin.dto;

import com.cancha.admin.repository.domain.type.TipoDocumento;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
public class ListarReservasDto {
    private String id;
    @NotEmpty
    private Date fechaReserva;
    @NotEmpty
    private Time horaReserva;
    @NotEmpty
    private int persona ;
    @NotEmpty
    private int cancha;
}
