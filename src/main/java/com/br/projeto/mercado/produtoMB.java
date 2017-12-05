package com.br.projeto.mercado;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.br.projeto.mercado.models.Produto;
import com.br.projeto.servicos.ProdutosService;

@ManagedBean
@RequestScoped
public class produtoMB implements Serializable{
	
	private static final long serialVersionUID = 1L;
	String produto;
	double preço;
	double quantidade;
	String unidade;
	int id;
	private List<Produto> listaProduto;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public double getPreço() {
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
	
	public List<Produto> getListaProduto(){
		ProdutosService pService = new ProdutosService();
		listaProduto = pService.findAll();
		return listaProduto;
	}
	
	public void excluir(int id) {
		ProdutosService pService = new ProdutosService();
		pService.delete(id);
	}
	

}
