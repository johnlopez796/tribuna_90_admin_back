package com.cancha.admin.business;

import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.web.handler.error.RestException;
import java.util.Date;
import java.util.List;

public interface ListarReservasBusiness{


    /**
     *
     * @param nickName
     * @return
     */
    List<ListarReservasDto> consultarReservaNickName(String nickName) throws RestException;

    /**
     *
     * @param fechaReserva
     * @return
     * @throws RestException
     */
    ListarReservasDto consultarReservasFecha(Date fechaReserva) throws RestException;

    /**
     *
     * @param reserva
     * @return
     * @throws RestException
     */
    ListarReservasDto registarReserva(ListarReservasDto reserva) throws RestException;



}
