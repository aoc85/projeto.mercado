package com.br.projeto.mercado.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	//@Id
	//@Column(name="id")
	//private String id;
	
	@Column(name="senha")
	private String pwd;
	
	@Column(name="nome")
	private String nome;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		this.pwd = senha;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Usuario:"+nome+" Senha:"+pwd;
	}
	

}
