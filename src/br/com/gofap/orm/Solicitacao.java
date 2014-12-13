package br.com.gofap.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Solicitacao {
	
	
		
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer id;
		private String numero;
		private String nomeComp;
		private String numeroGD;
		private Double qtdPontoFuncao;
		private String matAnalistaResp;
		private String matGerenteTec;
		private String matGerenteInfo;
		private String tiposolicitacao;
		private Fornecedor fornecedor;
		private Usuario usuario;
		private LinguagemProgramacao linguagemProgramacao;
		private Vertical vertical;
		private Coordenacao coordenacao;

		
		public Solicitacao() {

		}

		
		

		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getNumero() {
			return numero;
		}


		public void setNumero(String numero) {
			this.numero = numero;
		}


		public String getNomeComp() {
			return nomeComp;
		}


		public void setNomeComp(String nomeComp) {
			this.nomeComp = nomeComp;
		}


		public String getNumeroGD() {
			return numeroGD;
		}


		public void setNumeroGD(String numeroGD) {
			this.numeroGD = numeroGD;
		}


		public Double getQtdPontoFuncao() {
			return qtdPontoFuncao;
		}


		public void setQtdPontoFuncao(Double qtdPontoFuncao) {
			this.qtdPontoFuncao = qtdPontoFuncao;
		}


		public String getMatAnalistaResp() {
			return matAnalistaResp;
		}


		public void setMatAnalistaResp(String matAnalistaResp) {
			this.matAnalistaResp = matAnalistaResp;
		}


		public String getMatGerenteTec() {
			return matGerenteTec;
		}


		public void setMatGerenteTec(String matGerenteTec) {
			this.matGerenteTec = matGerenteTec;
		}


		public String getMatGerenteInfo() {
			return matGerenteInfo;
		}


		public void setMatGerenteInfo(String matGerenteInfo) {
			this.matGerenteInfo = matGerenteInfo;
		}


		public String getTiposolicitacao() {
			return tiposolicitacao;
		}


		public void setTiposolicitacao(String tiposolicitacao) {
			this.tiposolicitacao = tiposolicitacao;
		}


		public Fornecedor getFornecedor() {
			return fornecedor;
		}


		public void setFornecedor(Fornecedor fornecedor) {
			this.fornecedor = fornecedor;
		}


		public Usuario getUsuario() {
			return usuario;
		}


		public void setUsuario(Usuario usuario) {
			this.usuario = usuario;
		}


		public LinguagemProgramacao getLinguagemProgramacao() {
			return linguagemProgramacao;
		}


		public void setLinguagemProgramacao(LinguagemProgramacao linguagemProgramacao) {
			this.linguagemProgramacao = linguagemProgramacao;
		}


		public Vertical getVertical() {
			return vertical;
		}


		public void setVertical(Vertical vertical) {
			this.vertical = vertical;
		}


		public Coordenacao getCoordenacao() {
			return coordenacao;
		}


		public void setCoordenacao(Coordenacao coordenacao) {
			this.coordenacao = coordenacao;
		}
		
		
		
		
}
