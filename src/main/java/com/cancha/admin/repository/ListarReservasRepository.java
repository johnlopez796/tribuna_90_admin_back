package com.cancha.admin.repository;

import com.cancha.admin.dto.UsuarioDto;
import com.cancha.admin.repository.domain.Persona;
import com.cancha.admin.repository.domain.Reserva;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.repository.domain.type.TipoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.Optional;


public interface ListarReservasRepository extends MongoRepository<Reserva,String> {


    @Query("{persona: { nombres: ?0}}")
    Optional<Reserva> findByName(String persona);
    @Query("{fechaReserva: ?0, persona: ?1}")
    Optional<Reserva> findByFechaAndPersona(Date fechaReserva, Persona persona);

    Optional<Reserva> findByFechaReserva(Date fechaReserva);

}
