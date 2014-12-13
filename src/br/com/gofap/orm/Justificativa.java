package br.com.gofap.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Justificativa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String justificativaInformada;
	private Registro registro;
	
	
	
	public Justificativa() {

	}


	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getJustificativaInformada() {
		return justificativaInformada;
	}



	public void setJustificativaInformada(String justificativaInformada) {
		this.justificativaInformada = justificativaInformada;
	}



	public Registro getRegistro() {
		return registro;
	}



	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
	
	

}
