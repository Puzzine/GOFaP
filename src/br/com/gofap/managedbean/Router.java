package br.com.gofap.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;




@ManagedBean(name="router")
@RequestScoped
public class Router {

			
		
	public Router() {

	}
	
	
	public String fornecedor(){
		return "fornecedor";
	}
	
	
	public String vertical(){
		return "vertical";
	}
	
	
}
