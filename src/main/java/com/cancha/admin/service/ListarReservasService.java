package com.cancha.admin.service;

import com.cancha.admin.repository.domain.Persona;
import com.cancha.admin.repository.domain.Reserva;
import java.util.Date;

import java.util.List;
import java.util.Optional;

public interface ListarReservasService {
    /**
     *
     * @param reserva
     * @return
     */
    Reserva saveReserva(Reserva reserva);

    /**
     *
     * @param fechaReserva
     * @return
     */
    List<Reserva> findByDate(Date fechaReserva);

    /**
     *
     * @param nickName
     * @return
     */
    List<Reserva> findByNickName(String nickName);

    /**
     *
     * @param fechaReserva
     * @param nickName
     * @return
     */
    List<Reserva> findByDateandNickname(Date fechaReserva,
                                     Persona nickName);



}
