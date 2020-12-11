package br.com.project.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.project.model.Convidados;


@Repository
public class ConvidadosRepository {
	
	private static final List<Convidados> LIS_CONVIDADOS = new ArrayList<>();
	
	static {
		LIS_CONVIDADOS.add(new Convidados("Pedro", 2));
		LIS_CONVIDADOS.add(new Convidados("Maria", 3));
		LIS_CONVIDADOS.add(new Convidados("Ricardo", 1));
				
	}
	
	public List<Convidados> todos(){
		return ConvidadosRepository.LIS_CONVIDADOS;
	}
	
	public void adicionar(Convidados convidado){
		ConvidadosRepository.LIS_CONVIDADOS.add(convidado);
		
	}
	

};
