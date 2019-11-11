package com.cancha.admin.web.rest.controller.impl;

import com.cancha.admin.business.AdminBusiness;
import com.cancha.admin.dto.adminDto;
import com.cancha.admin.web.rest.controller.ClienteController;
import com.cancha.admin.web.rest.controller.model.IngresoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
@Validated
public class ClienteControllerImpl implements ClienteController {

    private AdminBusiness usuarioBusiness;

    public ClienteControllerImpl(AdminBusiness usuarioBusiness) {
        this.usuarioBusiness = usuarioBusiness;
    }

    @PostMapping
    @Override
    public ResponseEntity<adminDto> registrarUsuario(@RequestBody adminDto adminDto) {
        return ResponseEntity.ok(usuarioBusiness.registrarUsuario(adminDto));
    }

    @PostMapping("/ingreso")
    @Override
    public ResponseEntity<adminDto> validarIngreso(@RequestBody IngresoRequest ingresoRq) {
        return ResponseEntity.ok(usuarioBusiness.validarIngreso(ingresoRq.getNickName(),ingresoRq.getPassword()));
    }
}
