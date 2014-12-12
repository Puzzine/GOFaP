package br.com.gofap.orm;

import java.math.BigDecimal;
import java.util.Date;

public class CustoHora {

	
	
	private Integer id;
	private BigDecimal vlCustoHora;
	private Date dtInicioValidade;
	private Fornecedor fornecedor;
	
	
	public CustoHora() {

	}
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getVlCustoHora() {
		return vlCustoHora;
	}
	public void setVlCustoHora(BigDecimal vlCustoHora) {
		this.vlCustoHora = vlCustoHora;
	}
	public Date getDtInicioValidade() {
		return dtInicioValidade;
	}
	public void setDtInicioValidade(Date dtInicioValidade) {
		this.dtInicioValidade = dtInicioValidade;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	
	
	
	
	
	
}
