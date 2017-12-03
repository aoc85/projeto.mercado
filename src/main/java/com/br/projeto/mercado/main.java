package com.br.projeto.mercado;

import java.util.List;

import com.br.projeto.mercado.models.Usuario;
import com.br.projeto.servicos.UsuarioService;

public class main {

	public static void main(String[] args) {
		UsuarioService us = new UsuarioService(); 
		List<Usuario> users = us.findAll();
		
		for(Usuario a : users) {
			System.out.println(a.toString() + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nn\n\n\n\n\n\n");
		}
	}

}
