package com.cancha.admin.web.rest.controller.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class IngresoRequest {
    @NotEmpty
    private String nickName;
    @NotEmpty
    private String password;
}
