package br.com.gofap.orm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Usuario {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String matricula;
	private List<Perfil> perfies;
	private String senha;
	
	
	
	public Usuario() {

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

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}


	public List<Perfil> getPerfies() {
		return perfies;
	}

	public void setPerfies(List<Perfil> perfies) {
		this.perfies = perfies;
	}
	
	
	
	
}
