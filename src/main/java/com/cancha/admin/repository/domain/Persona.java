package com.cancha.admin.repository.domain;

import com.cancha.admin.repository.domain.type.TipoDocumento;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Persona {
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String genero;
    private String email;
    private String documento;
    private TipoDocumento tipoDocumento;
    private Date fechaRegistro;

}
