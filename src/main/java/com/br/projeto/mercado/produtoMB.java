package com.br.projeto.mercado;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class produtoMB implements Serializable{
	String produto;
	double preço;
	double quantidade;
	String unidade;
	int codigo;
	
	public int getCodigo() {
		this.codigo = 10;
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreço() {
		this.preço = 100.00;
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public double getQuantidade() {
		this.quantidade = 200.00;
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public String getUnidade() {
		this.unidade = "Quilo";
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	public String getProduto() {
		this.produto = "Produto";
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	

}
