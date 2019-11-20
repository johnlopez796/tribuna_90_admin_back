package com.cancha.admin.map;

import com.cancha.admin.config.MapStructConfig;
import com.cancha.admin.dto.EstablecimientoDto;
import com.cancha.admin.repository.domain.Establecimiento;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", config = MapStructConfig.class)
public abstract class EstablecimientoMapper {


    public abstract EstablecimientoDto toEstablecimientoDto(Establecimiento establecimiento);

    public abstract List<EstablecimientoDto> toEstablecimientoDtoList(List<Establecimiento> establecimiento);
}
