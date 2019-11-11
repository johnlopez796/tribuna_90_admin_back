package com.cancha.admin.repository;

import com.cancha.admin.repository.domain.Reserva;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.repository.domain.type.TipoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.Optional;


public interface ListarReservasRepository extends MongoRepository<Reserva,String> {


    Optional<Reserva> findByName(String persona);
    @Query("{ 'persona: {fechaReserva': ?0, 'persona': ?1}}")
    Optional<Reserva> findByFechaAndPersona(Date fechaReserva,
                                            String persona);
    Optional<Reserva> findByFecha(Date fechaReserva);

}
