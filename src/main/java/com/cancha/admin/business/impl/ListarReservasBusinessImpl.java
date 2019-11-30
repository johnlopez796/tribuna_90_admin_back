package com.cancha.admin.business.impl;


import com.cancha.admin.business.AdminBusiness;
import com.cancha.admin.business.ListarReservasBusiness;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.dto.adminDto;
import com.cancha.admin.map.AdminMapper;
import com.cancha.admin.map.ListarReservasMapper;
import com.cancha.admin.repository.domain.Reserva;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.service.ListarReservasService;
import com.cancha.admin.service.UsuarioService;
import com.cancha.admin.validation.UsuarioValidation;
import com.cancha.admin.web.handler.error.RestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 *
 */
@Service
public class ListarReservasBusinessImpl implements ListarReservasBusiness {
    private ListarReservasService listarReservasService;
    private ListarReservasMapper listarReservasMapper;

    public ListarReservasBusinessImpl(ListarReservasService listarReservasService, ListarReservasMapper listarReservasMapper) {
        this.listarReservasService = listarReservasService;
        this.listarReservasMapper = listarReservasMapper;
    }

    @Override
    public List<ListarReservasDto> consultarReservaNickName(String nickName) throws RestException {
        List<ListarReservasDto> listarReservasDtos = listarReservasMapper.toListListarReservasDto(
                listarReservasService.findByNickName(nickName)
        );
        return listarReservasDtos;
    }

    @Override
    public ListarReservasDto consultarReservasFecha(Date fechaReserva) throws RestException {
        return null;
    }

    @Override
    public ListarReservasDto registarReserva(ListarReservasDto reservaDto) throws RestException {
        Reserva reserva = listarReservasMapper.toReservas(reservaDto);
        reserva = listarReservasService.saveReserva(reserva);
        return listarReservasMapper.toListarReservasDto(reserva);
    }
}


