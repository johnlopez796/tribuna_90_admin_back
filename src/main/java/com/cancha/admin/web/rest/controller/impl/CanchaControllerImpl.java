package com.cancha.admin.web.rest.controller.impl;

import com.cancha.admin.business.CanchaBusiness;
import com.cancha.admin.dto.CanchaDto;
import com.cancha.admin.web.rest.controller.CanchaController;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/cancha")
@Validated
public class CanchaControllerImpl implements CanchaController {

    private CanchaBusiness canchaBusiness;

    public CanchaControllerImpl(CanchaBusiness canchaBusiness) {
        this.canchaBusiness = canchaBusiness;
    }

    @GetMapping("/establecimiento/{nombre}")
    @Override
    public ResponseEntity<List<CanchaDto>> consultaCanchaByNickName(@PathVariable String nombre) {
        return ResponseEntity.ok(canchaBusiness.consultarCanchaEstablecimiento(nombre));
    }
}

