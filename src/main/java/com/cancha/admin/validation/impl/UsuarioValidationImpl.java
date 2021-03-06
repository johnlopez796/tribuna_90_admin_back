package com.cancha.admin.validation.impl;

import com.cancha.admin.config.AppConfig;
import com.cancha.admin.repository.domain.Persona;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.service.UsuarioService;
import com.cancha.admin.validation.UsuarioValidation;
import com.cancha.admin.web.handler.error.RestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UsuarioValidationImpl implements UsuarioValidation {

    private UsuarioService usuarioService;
    private AppConfig appConfig;

    public UsuarioValidationImpl(UsuarioService usuarioService, AppConfig appConfig) {
        this.usuarioService = usuarioService;
        this.appConfig = appConfig;
    }

    /**
     * @param usuario
     */
    public void validacionInicioSesion(Usuario usuario) throws RestException{
        if(usuario.isBloqueado()){
            throw new RestException(HttpStatus.LOCKED,"El usuario se encuentra bloqueado");
        }else if(usuario.getIntentos() >= appConfig.getMaxIntentosIngreso()){
            usuario.setBloqueado(true);
            usuarioService.saveUsuario(usuario);
            throw new RestException(HttpStatus.LOCKED,"El usuario se encuentra bloqueado");
        }
    }

    /**
     * @param usuario
     */
    public void validacionRegistro(Usuario usuario) throws RestException {
        Optional<Usuario> usrBD = this.usuarioService.findByNickName(usuario.getNickname());

        if(usrBD.isPresent()){
            throw new RestException(HttpStatus.CONFLICT, "Ya existe nickname");
        }else{
            Persona persona = usuario.getPersona();
            usrBD = this.usuarioService.findByDocyType(persona.getDocumento(),persona.getTipoDocumento());
            usrBD.ifPresent(
                    usuario1 -> {
                        throw new RestException(HttpStatus.CONFLICT, "El usuario ya se encuentra registrado.");
                    }
            );
        }

    }

}
