package br.com.gofap.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class LinguagemProgramacao {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Integer codigo;
	private String nome;
	private Double peso;
	
	
	
	public LinguagemProgramacao() {

	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getCodigo() {
		return codigo;
	}



	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getPeso() {
		return peso;
	}



	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
	
	
}
