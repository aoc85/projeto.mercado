package com.br.projeto.mercado.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="senha")
	private String pwd;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="nome")
	private String nome;
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String senha, int id) {
		this.nome = nome;
		this.pwd = senha;
		this.id = id;
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
