package com.cancha.admin.service;

import com.cancha.admin.repository.domain.Cancha;
import com.cancha.admin.repository.domain.Establecimiento;
import com.cancha.admin.repository.domain.Reserva;

import java.util.List;
import java.util.Optional;

public interface CanchaService {

    /**
     *
     * @param cancha
     * @return
     */
    Cancha saveCancha(Cancha cancha);

    /**
     *
     * @param establecimiento
     * @return
     */
    List<Cancha> findByEstablecimiento(Establecimiento establecimiento);

    /**
     *
     * @param capacidad
     * @return
     */
    List<Cancha> findByCapacidad(Integer capacidad);
    /**
     *
     * @param grama
     * @return
     */
    List<Cancha> findBytipoGrama(String grama);





}
