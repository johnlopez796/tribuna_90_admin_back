package com.cancha.admin.business;


import com.cancha.admin.dto.adminDto;
import com.cancha.admin.web.handler.error.RestException;

public interface AdminBusiness {

    /**
     *
     * @param usuarioDto
     * @return
     */
    adminDto registrarUsuario(adminDto usuarioDto) throws RestException;

    /**
     *
     * @param nickname
     * @param password
     * @return
     * @throws RestException
     */
    adminDto validarIngreso(String nickname, String password) throws RestException;

}
