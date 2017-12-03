package com.br.projeto.mercado.models;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String pwd;
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String verifica() {
		System.out.println(name);
		System.out.println(name.equals("Andre"));
		if(name.equals("Andre")) {
			return "/entrada.xhtml";
		}
	    return null;
	}
	
	
}
