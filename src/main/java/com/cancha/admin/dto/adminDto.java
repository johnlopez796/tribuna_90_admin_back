package com.cancha.admin.dto;

import com.cancha.admin.repository.domain.type.TipoDocumento;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Data
public class adminDto {
    private String id;
    @NotEmpty
    private TipoDocumento tipoDocumento;
    @NotEmpty
    private String documento;
    @NotEmpty
    private String nombres;
    @NotEmpty
    private String apellidos;
    private Date fechaNacimiento;
    @NotEmpty
    private String nickname;
    @NotEmpty
    @Email
    private String email;
    private String clave;
    private List<String> rol;
}
