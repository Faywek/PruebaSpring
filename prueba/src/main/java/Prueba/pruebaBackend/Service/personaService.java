package Prueba.pruebaBackend.Service;

import java.util.List;
import Prueba.pruebaBackend.Entity.Persona;

public interface personaService {

	public abstract List<Persona> listAllPersona();
	public abstract Persona addPersona(Persona per);
	public abstract int deletePersona(int id);
	public abstract Persona updatePersona(Persona per);
	
}
