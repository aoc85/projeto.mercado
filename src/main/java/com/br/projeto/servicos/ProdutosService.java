package com.br.projeto.servicos;

import java.util.List;

import com.br.projeto.mercado.DAO.ProdutoDAO;
import com.br.projeto.mercado.models.Produto;

public class ProdutosService {
	private static ProdutoDAO produtoDAO;
	
	public ProdutosService() {
		produtoDAO = new ProdutoDAO();
	}
	
	public void persist(Produto entity) {
		produtoDAO.openCurrentSessionwithTransaction();
		produtoDAO.persist(entity);
		produtoDAO.closeCurrentSessionwithTransaction();
	}
	
	public void update(Produto entity) {
		produtoDAO.openCurrentSessionwithTransaction();
		produtoDAO.persist(entity);
		produtoDAO.closeCurrentSessionwithTransaction();
	}
	
	public Produto findById(int id) {
		produtoDAO.openCurrentSession();
		Produto produto = produtoDAO.findById(id);
		produtoDAO.closeCurrentSession();
		return produto;
	}
	
	public void delete(int id) {
		produtoDAO.openCurrentSessionwithTransaction();
		Produto produto = produtoDAO.findById(id);
		produtoDAO.delete(produto);
		produtoDAO.closeCurrentSessionwithTransaction();
	}
	
	public List<Produto>findAll(){
		produtoDAO.openCurrentSession();
		List<Produto> produtos = produtoDAO.findAll();
		produtoDAO.closeCurrentSession();
		return produtos;
	}
	public ProdutoDAO produtoDAO() {
		return produtoDAO;
	}
}
