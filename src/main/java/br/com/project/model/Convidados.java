package br.com.project.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class Convidados {
	
	private static final List<Convidado> LIS_CONVIDADOS = new ArrayList<>();
	
	static {
		LIS_CONVIDADOS.add(new Convidado("Pedro", 2));
		LIS_CONVIDADOS.add(new Convidado("Maria", 3));
		LIS_CONVIDADOS.add(new Convidado("Ricardo", 1));
				
	}
	
	public List<Convidado> todos(){
		return Convidados.LIS_CONVIDADOS;
	}
	
	public void adicionar(Convidado convidado){
		Convidados.LIS_CONVIDADOS.add(convidado);
		
	}
	

};
