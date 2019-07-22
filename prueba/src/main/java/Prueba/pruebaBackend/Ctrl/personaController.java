package Prueba.pruebaBackend.Ctrl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Prueba.pruebaBackend.Entity.Persona;
import Prueba.pruebaBackend.Service.personaService;;

@Controller
@RequestMapping("/persona")
public class personaController {
	
	private static final String PERSONA_VIEW	=	"tablaSpring";
	
	private static final Log LOG	=	LogFactory.getLog(personaController.class);
	
	@Autowired
	@Qualifier("personaServiceImpl")
	private personaService personaService;
	
	@GetMapping("/listpersona")
	public ModelAndView listarTodasPersona() {
		LOG.info("Call: listarTodasPersona()");
		ModelAndView mav = new ModelAndView(PERSONA_VIEW);
		mav.addObject("personaForm", new Persona());
		mav.addObject("personas", personaService.listAllPersona());
		return mav;
	}
	
	@PostMapping("/addpersona")
	public String addPersona(@ModelAttribute("persona") Persona per) {
		LOG.info("Call: addPersona()"+"--PARAM:"+per.toString());
		personaService.addPersona(per);
		return "redirect:/persona/listpersona";
	}
}
