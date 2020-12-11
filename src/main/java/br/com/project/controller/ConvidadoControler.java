package br.com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.project.repository.ConvidadosRepository;

@Controller
public class ConvidadoControler {
	
	//a URL http://localhost:8080/ convidados, e o Spring MVC saberá que a view
	@Autowired
	private ConvidadosRepository convidados;
	
	@RequestMapping("/convidados")
	public ModelAndView listar(){
		
		
		ModelAndView mv = new ModelAndView("ListaConvidados");
	
		mv.addObject("convidados", convidados.todos());
		
		return mv;
	}
	

}
