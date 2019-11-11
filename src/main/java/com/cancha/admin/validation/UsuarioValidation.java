package com.cancha.admin.validation;


import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.web.handler.error.RestException;

public interface UsuarioValidation {

    /**
     *
     * @param usuario
     * @throws RestException
     */
    void validacionInicioSesion(Usuario usuario) throws RestException;

    /**
     *
     * @param usuario
     * @throws RestException
     */
    void validacionRegistro(Usuario usuario) throws RestException;
}
