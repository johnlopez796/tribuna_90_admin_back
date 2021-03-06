package com.cancha.admin.business;

import com.cancha.admin.dto.CanchaDto;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.repository.domain.Establecimiento;
import com.cancha.admin.web.handler.error.RestException;
import java.util.Date;
import java.util.List;

public interface CanchaBusiness {


    /**
     *
     * @param establecimiento
     * @return
     */
    List<CanchaDto> consultarCanchaEstablecimiento(Establecimiento establecimiento) throws RestException;

    /**
     *
     * @param tipoGrama
     * @return
     * @throws RestException
     */
    List<CanchaDto> consultarCanchaTipGrama(String tipoGrama) throws RestException;

    /**
     *
     * @param capacidad
     * @return
     * @throws RestException
     */
    List<CanchaDto> consultarCanchaCapacidad(Integer capacidad) throws RestException;

    /**
     *
     * @param cancha
     * @return
     * @throws RestException
     */
    CanchaDto registarCancha(CanchaDto cancha) throws RestException;



}
