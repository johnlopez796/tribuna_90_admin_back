package com.cancha.admin.repository;

import com.cancha.admin.dto.UsuarioDto;
import com.cancha.admin.repository.domain.Persona;
import com.cancha.admin.repository.domain.Reserva;
import com.cancha.admin.repository.domain.Usuario;
import com.cancha.admin.repository.domain.type.TipoDocumento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface ListarReservasRepository extends MongoRepository<Reserva,String> {


    @Query("{usuario: { nickname: ?0}}")
    List<Reserva> findByName(String nickname);
    @Query("{fechaReserva: ?0, persona: ?1}")
    List<Reserva> findByFechaAndPersona(Date fechaReserva, Persona persona);

    List<Reserva> findByFechaReserva(Date fechaReserva);

}
