package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Controller {

	public static String main(String[] args) {	
		return "entrada.xhtml";

	}

}
