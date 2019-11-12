package com.cancha.admin.service.impl;

import com.cancha.admin.repository.ListarReservasRepository;
import com.cancha.admin.repository.domain.Persona;
import com.cancha.admin.repository.domain.Reserva;
import com.cancha.admin.service.ListarReservasService;
import org.springframework.stereotype.Service;
import java.util.Date;

import java.util.List;
import java.util.Optional;

@Service
public class ListarReservasServiceImpl implements ListarReservasService {

        private ListarReservasRepository listarReservasRepository;

        public ListarReservasServiceImpl(ListarReservasRepository listarReservasRepository) {
            this.listarReservasRepository = listarReservasRepository;
        }

        @Override
        public Reserva saveReserva(Reserva reserva){
            return listarReservasRepository.save(reserva);
        }

        @Override
        public List<Reserva> findByDate(Date fechaReserva){
            return listarReservasRepository.findByFechaReserva(fechaReserva);
        }

        @Override
        public List<Reserva> findByNickName(String nickName){
            return listarReservasRepository.findByName(nickName);

        }

        @Override
        public List<Reserva> findByDateandNickname(Date fechaReserva,
                                                Persona nickName){
            return listarReservasRepository.findByFechaAndPersona(fechaReserva,nickName);
        }




    }


