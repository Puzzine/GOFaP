package br.com.gofap.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Csra {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String nomeComp;
	private String linguagem;
	private String statusComp;
	private String coordComp;
	private String verticalComp;
	private String matGI;
	private String matGT;
	private String matGR;
	private String matAR;
	private String matAS;
	
	
	public Csra() {

	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeComp() {
		return nomeComp;
	}


	public void setNomeComp(String nomeComp) {
		this.nomeComp = nomeComp;
	}


	public String getLinguagem() {
		return linguagem;
	}


	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}


	public String getStatusComp() {
		return statusComp;
	}


	public void setStatusComp(String statusComp) {
		this.statusComp = statusComp;
	}


	public String getCoordComp() {
		return coordComp;
	}


	public void setCoordComp(String coordComp) {
		this.coordComp = coordComp;
	}


	public String getVerticalComp() {
		return verticalComp;
	}


	public void setVerticalComp(String verticalComp) {
		this.verticalComp = verticalComp;
	}


	public String getMatGI() {
		return matGI;
	}


	public void setMatGI(String matGI) {
		this.matGI = matGI;
	}


	public String getMatGT() {
		return matGT;
	}


	public void setMatGT(String matGT) {
		this.matGT = matGT;
	}


	public String getMatGR() {
		return matGR;
	}


	public void setMatGR(String matGR) {
		this.matGR = matGR;
	}


	public String getMatAR() {
		return matAR;
	}


	public void setMatAR(String matAR) {
		this.matAR = matAR;
	}


	public String getMatAS() {
		return matAS;
	}


	public void setMatAS(String matAS) {
		this.matAS = matAS;
	}
	
	
	
	
	
	
	
	

}
