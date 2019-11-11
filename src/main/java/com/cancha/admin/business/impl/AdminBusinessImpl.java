package com.cancha.admin.business.impl;

import com.cancha.admin.business.AdminBusiness;
import com.cancha.admin.dto.adminDto;
import com.cancha.admin.map.AdminMapper;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.service.UsuarioService;
import com.cancha.admin.validation.UsuarioValidation;
import com.cancha.admin.web.handler.error.RestException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

/**
 *
 */
@Service
public class AdminBusinessImpl implements AdminBusiness{
    private UsuarioService usuarioService;
    private UsuarioValidation usuarioValidation;
    private AdminMapper adminMapper;

    public AdminBusinessImpl(UsuarioService usuarioService, UsuarioValidation usuarioValidation, AdminMapper adminMapper) {
        this.usuarioService = usuarioService;
        this.usuarioValidation = usuarioValidation;
        this.adminMapper = adminMapper;
    }

    /**
     *
     * @param adminDto
     * @return
     */
    public adminDto registrarUsuario(adminDto adminDto)throws RestException {
        Usuario usuario = adminMapper.toAdminDto(adminDto);
        usuarioValidation.validacionInicioSesion(usuario);
        usuario.setBloqueado(false);
        usuario.setFechaCreacion(new Date());
        usuario.setIntentos(0);
        usuario = usuarioService.saveUsuario(usuario);
        return adminMapper.toAdmin(usuario);
    }



    public adminDto validarIngreso(String nickname, String password)throws RestException{
        Optional<Usuario> usuario = usuarioService.findByNickName(nickname);
        if(usuario.isPresent()){
            if(usuario.get().getPassword().equals(password)){
                usuarioValidation.validacionInicioSesion(usuario.get());
                usuario.get().setIntentos(0);
                usuario.get().setUltimoIngreso(new Date());
                usuarioService.saveUsuario(usuario.get());
                return adminMapper.toAdmin(usuario.get());
            }else {
                usuario.get().setIntentos(usuario.get().getIntentos()+1);
                usuarioService.saveUsuario(usuario.get());
                throw new RestException(HttpStatus.UNAUTHORIZED,"Usuario y/o contraseña invalidos");
            }
        }else{
            throw new RestException(HttpStatus.UNAUTHORIZED,"Usuario y/o contraseña invalidos");
        }
    }
}
