package com.br.projeto.servicos;

import java.util.List;

import com.br.projeto.mercado.DAO.UsuarioDAO;
import com.br.projeto.mercado.models.Usuario;

public class UsuarioService {
	private static UsuarioDAO usuarioDao;
	
	public UsuarioService() {
		usuarioDao = new UsuarioDAO();
	}
	
	public void persist(Usuario entity) {
		usuarioDao.openCurrentSessionwithTransaction();
		usuarioDao.persist(entity);
		usuarioDao.closeCurrentSessionwithTransaction();
	}
	
	public void update(Usuario entity) {
		usuarioDao.openCurrentSessionwithTransaction();
		usuarioDao.update(entity);
		usuarioDao.closeCurrentSessionwithTransaction();
	}
	
	public Usuario findById(int id) {
		usuarioDao.openCurrentSession();
		Usuario usuario = usuarioDao.findById(id);
		usuarioDao.closeCurrentSession();
		return usuario;
	}
	
	public void delete(int id) {
		usuarioDao.openCurrentSessionwithTransaction();
		Usuario usuario = usuarioDao.findById(id);
		usuarioDao.delete(usuario);
		usuarioDao.closeCurrentSessionwithTransaction();
	}
	
	public List<Usuario>findAll(){
		usuarioDao.openCurrentSession();
		List<Usuario> usuarios = usuarioDao.findAll();
		usuarioDao.closeCurrentSession();
		return usuarios;		
	}
	
	public UsuarioDAO usuarioDao() {
		return usuarioDao;
	}
	
}
