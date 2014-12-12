package br.com.gofap.orm;

public class CustoEfetivo {

	private Integer id;
	private Double cursoEfetivo;
	private Registro registro;
	
	
	
	
	public CustoEfetivo() {

	}
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getCursoEfetivo() {
		return cursoEfetivo;
	}
	public void setCursoEfetivo(Double cursoEfetivo) {
		this.cursoEfetivo = cursoEfetivo;
	}
	public Registro getRegistro() {
		return registro;
	}
	public void setRegistro(Registro registro) {
		this.registro = registro;
	}
	
	
	
}
