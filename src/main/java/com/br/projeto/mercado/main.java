package com.br.projeto.mercado;

import java.util.List;

import com.br.projeto.mercado.models.Usuario;
import com.br.projeto.servicos.UsuarioService;

public class main {

	public static void main(String[] args) {
		UsuarioService u = new UsuarioService();
		Usuario a = new Usuario("andre", "carvalho");
		System.out.println(a);
		u.persist(a);
	}

}
