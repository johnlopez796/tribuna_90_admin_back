package com.cancha.admin.web.rest.controller;

import com.cancha.admin.dto.adminDto;
import com.cancha.admin.web.handler.error.ApiError;
import com.cancha.admin.web.rest.controller.model.IngresoRequest;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Api(description = "Operaciones cliente tribuna 90", tags = "cliente")
public interface AdminController {

    @ApiOperation(value = "Registro de cliente", response = adminDto.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses( value = {
            @ApiResponse(code = 409, response = ApiError.class, message = "Usuario o nickname ya existe")
    })
    ResponseEntity<adminDto> registrarUsuario(@RequestBody adminDto usuarioDto);

    @ApiOperation(value = "Validar ingreso a la aplicación", response = adminDto.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses( value = {
            @ApiResponse(code = 409, response = ApiError.class, message = "Usuario bloqueado"),
            @ApiResponse(code = 401, response = ApiError.class, message = "Contraseña y/o usuario invalido")
    })
    ResponseEntity<adminDto> validarIngreso(@Valid @RequestBody IngresoRequest ingresoRq);
}
