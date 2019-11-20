package com.cancha.admin.business.impl;

import com.cancha.admin.business.EstablecimientoBusiness;
import com.cancha.admin.dto.EstablecimientoDto;
import com.cancha.admin.map.CanchaMapper;
import com.cancha.admin.map.EstablecimientoMapper;
import com.cancha.admin.repository.domain.Establecimiento;
import com.cancha.admin.service.CanchaService;
import com.cancha.admin.service.EstablecimientoService;
import com.cancha.admin.util.CoordenadasUtil;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Metrics;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablecimientoBusinessImpl implements EstablecimientoBusiness {

    private EstablecimientoService establecimientoService;
    private EstablecimientoMapper establecimientoMapper;
    private CoordenadasUtil coordenadasUtil;
    private CanchaService canchaService;
    private CanchaMapper canchaMapper;

    public EstablecimientoBusinessImpl(EstablecimientoService establecimientoService, EstablecimientoMapper establecimientoMapper, CoordenadasUtil coordenadasUtil, CanchaService canchaService) {
        this.establecimientoService = establecimientoService;
        this.establecimientoMapper = establecimientoMapper;
        this.coordenadasUtil = coordenadasUtil;
        this.canchaService = canchaService;
    }

    public List<EstablecimientoDto> buscarEstablecimientoPorCoordenada(
            Point point
    ) {

        Distance distance = new Distance(5, Metrics.KILOMETERS);

        List<EstablecimientoDto> establecimientoList =
                establecimientoMapper.toEstablecimientoDtoList(establecimientoService.findByPosicion(point,distance));
        /*
        for (int i = 0; i < establecimientoList.size(); i++) {
            List<CanchaDto> canchas = canchaMapper.toCanchaDtoList(canchaService.findByEstablecimiento(establecimientoList.get(i).getId()));
            establecimientoList.get(i).setCanchas(canchas);
            establecimientoList.get(i).setNumeroCanchas(canchas.size());
        }*/

        return establecimientoList;
    }

    public void saveEstablecimiento(Establecimiento establecimiento){
        establecimientoService.saveEstablecimiento(establecimiento);
    }
}
