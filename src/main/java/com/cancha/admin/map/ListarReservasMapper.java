package com.cancha.admin.map;


import com.cancha.admin.config.MapStructConfig;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.repository.domain.Reserva;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", config = MapStructConfig.class)
public abstract class ListarReservasMapper {
    @Mappings(value = {
            @Mapping(target = "reserva.idReserva", source = "id"),
            @Mapping(target = "reserva.fechaReserva", source = "fechaReserva"),
            @Mapping(target = "reserva.persona", source = "persona"),
            @Mapping(target = "reserva.cancha", source = "cancha")
    })
    public abstract Reserva toListarReservasDto(ListarReservasDto listarReservasDto);

}
