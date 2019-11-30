package com.cancha.admin.map;


import com.cancha.admin.config.MapStructConfig;
import com.cancha.admin.dto.ListarReservasDto;
import com.cancha.admin.dto.UsuarioDto;
import com.cancha.admin.repository.domain.Reserva;
import com.cancha.admin.repository.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


import java.util.List;

@Mapper(componentModel = "spring", config = MapStructConfig.class)
public abstract class ListarReservasMapper {
    @Mappings(value = {
            @Mapping(target = "idReserva", source = "idReserva"),
            @Mapping(target = "fechaReserva", source = "fechaReserva"),
            @Mapping(target = "usuario", source = "personaReserva"),
            @Mapping(target = "cancha", source = "canchaReserva")
    })
    public abstract Reserva toReservas(ListarReservasDto listarReservasDto);

    @Mappings(value = {
            @Mapping(source = "persona.tipoDocumento", target = "tipoDocumento"),
            @Mapping(source = "persona.documento", target = "documento"),
            @Mapping(source = "persona.nombres", target = "nombres"),
            @Mapping(source = "persona.apellidos", target = "apellidos"),
            @Mapping(source = "persona.fechaNacimiento", target = "fechaNacimiento"),
            @Mapping(source = "nickname", target = "nickname"),
            @Mapping(source = "persona.email", target = "email")
    })
    public abstract UsuarioDto toUsuario(Usuario usuarioDto);

    @Mappings(value = {
            @Mapping(source = "idReserva", target = "idReserva"),
            @Mapping(source = "fechaReserva", target = "fechaReserva"),
            @Mapping(source = "usuario", target = "personaReserva"),
            @Mapping(source = "cancha", target = "canchaReserva")
    })
    public abstract ListarReservasDto toListarReservasDto(Reserva reserva);

    public abstract List<ListarReservasDto> toListListarReservasDto(List<Reserva> listarReservas);

}
