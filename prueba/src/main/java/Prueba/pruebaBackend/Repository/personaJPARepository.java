package Prueba.pruebaBackend.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Prueba.pruebaBackend.Entity.Persona;


@Repository("personaJPARepository")
public interface personaJPARepository extends JpaRepository<Persona, Serializable>{

}
