package br.com.gofap.managedbean;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean(value="router")
@RequestScoped
public class Router {

	
	
	
	public Router() {

	}
	
	
	public String fornecedor(){
		
		return "parametrizacao/fornecedor";
	}
	
	
	
	
	
}
