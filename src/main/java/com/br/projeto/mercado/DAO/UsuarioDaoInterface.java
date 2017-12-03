package com.br.projeto.mercado.DAO;

import java.io.Serializable;
import java.util.List;

public interface UsuarioDaoInterface<T, Id extends Serializable> {
	
	public void persist(T entity);
	public void update(T entity);
	public T findById(String id);
	public void delete(T entity);
	public List<T> findAll();
}