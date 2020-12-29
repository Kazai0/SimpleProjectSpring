package br.com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.project.model.Convidado;
import br.com.project.model.Convidados;

@Controller
@RequestMapping("/convidados")
public class ConvidadosControler {
	
	//a URL http://localhost:8080/ convidados, e o Spring MVC saberá que a view
	@Autowired
	private Convidados convidados;
	
	@RequestMapping
	public ModelAndView listar(){
		
	
		
		ModelAndView mv = new ModelAndView("ListaConvidados");
	
		mv.addObject(new Convidado());
		
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String Salvar(Convidado convidado) {
		this.convidados.adicionar(convidado);
		return "redirect:/convidados";
	}
	

	

}
