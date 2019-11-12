package com.cancha.admin.map;


import com.cancha.admin.config.MapStructConfig;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.repository.domain.Reserva;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.dto.UsuarioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", config = MapStructConfig.class)
public abstract class ListarReservasMapper {
    @Mappings(value = {
            @Mapping(target = "idReserva", source = "idReserva"),
            @Mapping(target = "fechaReserva", source = "fechaReserva"),
            @Mapping(target = "persona", source = "personaReserva"),
            @Mapping(target = "cancha", source = "canchaReserva")
    })
    public abstract Reserva toListarReservasDto(ListarReservasDto listarReservasDto);

}
