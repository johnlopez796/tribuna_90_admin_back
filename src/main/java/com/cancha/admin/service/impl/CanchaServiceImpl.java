package com.cancha.admin.service.impl;

import com.cancha.admin.repository.CanchaRepository;
import com.cancha.admin.repository.domain.Cancha;
import com.cancha.admin.repository.domain.Establecimiento;
import com.cancha.admin.service.CanchaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanchaServiceImpl implements CanchaService {

    private CanchaRepository canchaRepository;

    //contructor
    public CanchaServiceImpl(CanchaRepository canchaRepository) {
        this.canchaRepository = canchaRepository;
    }


    //metodo de guardar cancha
    @Override
    public Cancha saveCancha(Cancha cancha){
        return canchaRepository.save(cancha);
    }

    @Override
    public List<Cancha> findByEstablecimiento(Establecimiento establecimiento) {
        return canchaRepository.findByEstablecimiento(establecimiento);
    }

    @Override
    public List<Cancha> findByCapacidad(Integer capacidad) {
        return canchaRepository.findBycapacidad(capacidad);
    }

    @Override
    public List<Cancha> findBytipoGrama(String grama) {
        return canchaRepository.findBytipoGrama(grama);
    }


}

