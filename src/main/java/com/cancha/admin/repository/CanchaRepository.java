package com.cancha.admin.repository;

import com.cancha.admin.repository.domain.Cancha;
import com.cancha.admin.repository.domain.Establecimiento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CanchaRepository extends MongoRepository<Cancha,String> {


    List<Cancha> findBytipoGrama(String tipoGrama);
    List<Cancha> findBycapacidad(Integer capacidad);
    @Query("{ 'Establecimiento: {nombre': ?0}}")
    List<Cancha> findByEstablecimiento(Establecimiento establecimiento);

}
