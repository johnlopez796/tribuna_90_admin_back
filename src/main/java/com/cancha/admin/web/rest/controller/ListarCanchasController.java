package com.cancha.admin.web.rest.controller;

import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.web.handler.error.ApiError;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Api(description = "Operaciones cliente tribuna 90", tags = "admin")
public interface ListarCanchasController {

    @ApiOperation(value = "Listar las reservas", response = ListarReservasDto.class, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiResponses( value = {
            @ApiResponse(code = 409, response = ApiError.class, message = "No se encontraron reservas")
    })
    ResponseEntity<ListarReservasDto> listarReservas(@RequestBody ListarReservasDto listarReservasDto);

}
