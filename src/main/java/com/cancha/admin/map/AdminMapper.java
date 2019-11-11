package com.cancha.admin.map;


import com.cancha.admin.config.MapStructConfig;
import com.cancha.admin.dto.adminDto;
import com.cancha.admin.repository.domain.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

    @Mapper(componentModel = "spring", config = MapStructConfig.class)
    public abstract class AdminMapper {
        @Mappings(value = {
                @Mapping(target = "persona.tipoDocumento", source = "tipoDocumento"),
                @Mapping(target = "persona.documento", source = "documento"),
                @Mapping(target = "persona.nombres", source = "nombres"),
                @Mapping(target = "persona.apellidos", source = "apellidos"),
                @Mapping(target = "persona.fechaNacimiento", source = "fechaNacimiento"),
                @Mapping(target = "nickname", source = "nickname"),
                @Mapping(target = "persona.email", source = "email"),
                @Mapping(target = "password", source = "clave")
        })
        public abstract Usuario toAdminDto(adminDto adminDto);

        @Mappings(value = {
                @Mapping(source = "persona.tipoDocumento", target = "tipoDocumento"),
                @Mapping(source = "persona.documento", target = "documento"),
                @Mapping(source = "persona.nombres", target = "nombres"),
                @Mapping(source = "persona.apellidos", target = "apellidos"),
                @Mapping(source = "persona.fechaNacimiento", target = "fechaNacimiento"),
                @Mapping(source = "nickname", target = "nickname"),
                @Mapping(source = "persona.email", target = "email")
        })
        public abstract adminDto toAdmin(Usuario adminDto);
    }
