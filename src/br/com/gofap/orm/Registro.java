package br.com.gofap.orm;

import java.sql.Date;

public class Registro {

	private Integer id;
	private Date dtHoraRegistro;
	private Usuario resposavel;
	private Solicitacao solicitacao;
	private TipoRegistro tipoRegistro;
	
		
	
	
	public Registro() {

	}

	
	



	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public Date getDtHoraRegistro() {
		return dtHoraRegistro;
	}




	public void setDtHoraRegistro(Date dtHoraRegistro) {
		this.dtHoraRegistro = dtHoraRegistro;
	}




	public Usuario getResposavel() {
		return resposavel;
	}




	public void setResposavel(Usuario resposavel) {
		this.resposavel = resposavel;
	}




	public Solicitacao getSolicitacao() {
		return solicitacao;
	}




	public void setSolicitacao(Solicitacao solicitacao) {
		this.solicitacao = solicitacao;
	}




	public TipoRegistro getTipoRegistro() {
		return tipoRegistro;
	}




	public void setTipoRegistro(TipoRegistro tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	
	
	
	
	
	
	
}
