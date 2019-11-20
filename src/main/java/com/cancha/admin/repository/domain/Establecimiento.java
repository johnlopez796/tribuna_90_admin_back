package com.cancha.admin.repository.domain;


import com.cancha.admin.repository.domain.Persona;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document
@Getter
@Setter
public class Establecimiento {
    @Id
    private String id;
    private String nombre;
    private String ubicacion;
    private Date endTime;
    @DBRef
    private Usuario createUserId;
    private Date createDate;
    private Usuario lastModId;
    @DBRef
    private Usuario lasModUser;
    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2D)
    private Point location;
    private String horaApertura;
    private String horaCierre;
    private int numeroCanchas;

    public Establecimiento(String id){
        this.id = id;
    }

    public Establecimiento(){}
}
