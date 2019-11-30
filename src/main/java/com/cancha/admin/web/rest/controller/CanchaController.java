package com.cancha.admin.web.rest.controller;

import com.cancha.admin.dto.CanchaDto;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.web.handler.error.ApiError;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(description = "Operaciones cliente tribuna 90", tags = "Cancha")
public interface CanchaController {

    @ApiOperation(value = "Listar las canchas", response = CanchaDto.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses( value = {
            @ApiResponse(code = 409, response = ApiError.class, message = "No se encontraron canchas")
    })
    ResponseEntity<List<CanchaDto>> consultaCanchaByNickName(@PathVariable String nombre);


    @ApiOperation(value = "Registro de canchas", response = CanchaDto.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses( value = {
            @ApiResponse(code = 409, response = ApiError.class, message = "La cancha ya existe")
    })
    ResponseEntity<CanchaDto> registrarCancha(@RequestBody CanchaDto canchaDto);

}

