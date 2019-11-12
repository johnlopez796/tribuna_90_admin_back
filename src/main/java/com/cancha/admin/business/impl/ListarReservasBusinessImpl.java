package com.cancha.admin.business.impl;


import com.cancha.admin.business.AdminBusiness;
import com.cancha.admin.business.ListarReservasBusiness;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.dto.adminDto;
import com.cancha.admin.map.AdminMapper;
import com.cancha.admin.map.ListarReservasMapper;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.service.ListarReservasService;
import com.cancha.admin.service.UsuarioService;
import com.cancha.admin.validation.UsuarioValidation;
import com.cancha.admin.web.handler.error.RestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

/**
 *
 */
@Service
public class ListarReservasBusinessImpl implements ListarReservasBusiness {
    private ListarReservasService listarReservasService;
    private ListarReservasMapper listarReservasMapper;


    @Override
    public ListarReservasDto consultarReservaNickName(String nickName) throws RestException {
        return null;
    }

    @Override
    public ListarReservasDto consultarReservasFecha(Date fechaReserva) throws RestException {
        return null;
    }
}


