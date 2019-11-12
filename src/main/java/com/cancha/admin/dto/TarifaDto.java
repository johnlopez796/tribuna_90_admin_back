package com.cancha.admin.dto;

import com.cancha.admin.repository.domain.type.TipoDocumento;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class TarifaDto {
    private String idTarifa;
    @NotEmpty
    private String nombre;
    @NotEmpty
    private BigDecimal tarifa ;
    @NotEmpty
    private Integer horaIni;
    @NotEmpty
    private Integer horaFin;
    @NotEmpty
    private Boolean estado;
    @NotEmpty
    private Date fechaCreacion;
}


