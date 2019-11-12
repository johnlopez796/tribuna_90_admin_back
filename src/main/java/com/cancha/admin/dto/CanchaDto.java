package com.cancha.admin.dto;

import com.cancha.admin.repository.domain.type.TipoDocumento;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.sql.Time;
import java.util.Date;
import java.util.List;

@Data
public class CanchaDto {
    private String idCancha;
    @NotEmpty
    private Integer capacidad;
    @NotEmpty
    private Integer tipoGrama ;
    @NotEmpty
    private EstablecimientoDto establecimiento;
    @NotEmpty
    private String tipoTecho;
    @NotEmpty
    private Date createDate;
    @NotEmpty
    private UsuarioDto persona;
    @NotEmpty
    private Date lastModDate;
    @NotEmpty
    private TarifaDto tarifa;
}

