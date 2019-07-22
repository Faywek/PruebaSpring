package Prueba.pruebaBackend.Service.Impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import Prueba.pruebaBackend.Entity.Persona;
import Prueba.pruebaBackend.Repository.personaJPARepository;
import Prueba.pruebaBackend.Service.personaService;

@Service("personaServiceImpl")
public class personaServiceImpl implements personaService
{
	
	private static final Log LOG	=	LogFactory.getLog(personaServiceImpl.class);
	
	@Autowired
	@Qualifier("personaJPARepository")
	private personaJPARepository personaJpaRep;

	@Override
	public List<Persona> listAllPersona() {
		LOG.info("Call: listAllPersona()");
		return personaJpaRep.findAll();
	}

	@Override
	public Persona addPersona(Persona per) {
		LOG.info("Call: addPersona()");
		return personaJpaRep.save(per);
	}

	@Override
	public int deletePersona(int id) {
		personaJpaRep.deleteById(id);
		return 0;
	}

	@Override
	public Persona updatePersona(Persona per) {
		return personaJpaRep.save(per);
	}

}
