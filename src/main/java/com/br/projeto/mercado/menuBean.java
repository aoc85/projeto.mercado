package com.br.projeto.mercado;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class menuBean implements Serializable{
	
	private static final long serialVersionUID = 1L; 

	public String entrada() {
		return "entrada.xhtml";
	}
}
