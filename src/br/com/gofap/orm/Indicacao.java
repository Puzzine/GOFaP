package br.com.gofap.orm;

public class Indicacao {
	
	private Integer id;
	private String matDevIndicado;
	private Registro registro;
	
	
	
	public Indicacao() {

	}

	
	


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getMatDevIndicado() {
		return matDevIndicado;
	}



	public void setMatDevIndicado(String matDevIndicado) {
		this.matDevIndicado = matDevIndicado;
	}



	public Registro getRegistro() {
		return registro;
	}



	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
	
	
	
	
	

}
