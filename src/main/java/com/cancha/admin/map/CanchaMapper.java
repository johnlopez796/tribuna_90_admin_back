package com.cancha.admin.map;

import com.cancha.admin.config.MapStructConfig;
import com.cancha.admin.dto.CanchaDto;
import com.cancha.admin.dto.UsuarioDto;
import com.cancha.admin.repository.domain.Cancha;
import com.cancha.admin.repository.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", config = MapStructConfig.class)
public abstract class CanchaMapper {

    @Mappings(value = {
            @Mapping(target = "id", source = "idCancha"),
            @Mapping(target = "capacidad", source = "capacidad"),
            @Mapping(target = "tipoGrama", source = "tipoGrama"),
            @Mapping(target = "establecimiento", source = "establecimiento"),
            @Mapping(target = "tipoTecho", source = "tipoTecho"),
            @Mapping(target = "createDate", source = "createDate"),
            @Mapping(target = "lastModUserId", source = "persona"),
            @Mapping(target = "lastModDate", source = "lastModDate"),
            @Mapping(target = "tarifa", source = "tarifa")
    })
    public abstract Cancha toCancha(CanchaDto canchaDto);

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
            @Mapping(source = "cancha.id", target = "idCancha"),
            @Mapping(source = "cancha.capacidad", target = "capacidad"),
            @Mapping(source = "cancha.tipoGrama", target = "tipoGrama"),
            @Mapping(source = "establecimiento", target = "establecimiento"),
            @Mapping(source = "cancha.tipoTecho", target = "tipoTecho"),
            @Mapping(source = "cancha.createDate", target = "createDate"),
            @Mapping(source = "cancha.lastModUserId", target = "persona"),
            @Mapping(source = "cancha.lastModDate", target = "lastModDate"),
            @Mapping(source = "cancha.tarifa", target = "tarifa")
    })
    public abstract CanchaDto toCanchaDto(Cancha cancha);

    public abstract List<CanchaDto> toListCanchasDto(List<Cancha> cancha);

}
