package br.com.gofap.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Rgti {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String matricula;
	private String nome;
	private String email;
	private String codTelComercial;
	private String numTelComercil;
	
	
	public Rgti() {

	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCodTelComercial() {
		return codTelComercial;
	}


	public void setCodTelComercial(String codTelComercial) {
		this.codTelComercial = codTelComercial;
	}


	public String getNumTelComercil() {
		return numTelComercil;
	}


	public void setNumTelComercil(String numTelComercil) {
		this.numTelComercil = numTelComercil;
	}
	
	
	
	
	
	
}
