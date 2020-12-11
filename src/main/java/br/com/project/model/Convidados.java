package br.com.project.model;

public class Convidados {

	private String nome;
	private Integer quantidadeAcompanhantes;
	
	public Convidados(){
		
	}
	
	public Convidados(String nome, Integer quantidadeAcompanhantes) {
	
		this.nome = nome;
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	
	}

	public String getNome() {
		return nome;
	}

	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}
	
	
	
	
}
