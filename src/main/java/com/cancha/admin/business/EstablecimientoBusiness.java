package com.cancha.admin.business;


import com.cancha.admin.dto.EstablecimientoDto;
import com.cancha.admin.repository.domain.Establecimiento;
import org.springframework.data.geo.Point;

import java.util.List;

public interface EstablecimientoBusiness {

    /**
     *
     * @param point
     * @return
     */
    List<EstablecimientoDto> buscarEstablecimientoPorCoordenada(
            Point point
    );

    void saveEstablecimiento(Establecimiento establecimiento);
}
