package com.cancha.admin.business;

import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.web.handler.error.RestException;
import java.util.Date;

public interface ListarReservasBusiness{


    /**
     *
     * @param nickName
     * @return
     */
    ListarReservasDto consultarReservaNickName(String nickName) throws RestException;

    /**
     *
     * @param fechaReserva
     * @return
     * @throws RestException
     */
    ListarReservasDto consultarReservasFecha(Date fechaReserva) throws RestException;


}
