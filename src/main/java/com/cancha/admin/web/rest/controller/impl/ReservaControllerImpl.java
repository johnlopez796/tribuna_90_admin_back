package com.cancha.admin.web.rest.controller.impl;

import com.cancha.admin.business.AdminBusiness;
import com.cancha.admin.business.ListarReservasBusiness;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.dto.adminDto;
import com.cancha.admin.web.rest.controller.AdminController;
import com.cancha.admin.web.rest.controller.ReservaController;
import com.cancha.admin.web.rest.controller.model.IngresoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserva")
@Validated
public class ReservaControllerImpl implements ReservaController {

    private ListarReservasBusiness listarReservasBusiness;

    public ReservaControllerImpl(ListarReservasBusiness listarReservasBusiness) {
        this.listarReservasBusiness = listarReservasBusiness;
    }

    @PostMapping("/registroReserva")
    @Override
    public ResponseEntity<ListarReservasDto> registrarReserva(@RequestBody ListarReservasDto reservaDto) {
        return ResponseEntity.ok(listarReservasBusiness.registarReserva(reservaDto));
    }

    @GetMapping("/usuario/{nickname}")
    @Override
    public ResponseEntity<List<ListarReservasDto>> consultaReservaByNickName(@PathVariable String nickname) {
        return ResponseEntity.ok(listarReservasBusiness.consultarReservaNickName(nickname));
    }
}
