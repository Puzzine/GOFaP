package br.com.gofap.orm;

public class Representante {

	
	
	
	private Integer id;
	private String matRepresentante;
	private Fornecedor fornecedor;
	
	
	
	public Representante() {

	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getMatRepresentante() {
		return matRepresentante;
	}



	public void setMatRepresentante(String matRepresentante) {
		this.matRepresentante = matRepresentante;
	}



	public Fornecedor getFornecedor() {
		return fornecedor;
	}



	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
	
	
}
