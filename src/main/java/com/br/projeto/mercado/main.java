package com.br.projeto.mercado;

import java.sql.ResultSet;
import java.util.List;

import com.br.projeto.mercado.models.Produto;
import com.br.projeto.mercado.models.Usuario;
import com.br.projeto.servicos.ProdutosService;
import com.br.projeto.servicos.UsuarioService;

public class main {

	public static void main(String[] args) {
		UsuarioService u = new UsuarioService();
		Usuario a = new Usuario("uol", "teste");
		System.out.println(a);
		u.persist(a);
		
		ProdutosService p = new ProdutosService();
		System.out.println(p);
		//Produto pr = new Produto("Arroz", 100, "Pacotes", 15.00);
		//System.out.println(pr);
		//p.persist(pr);
		u.findById(1);
		List<Usuario> uo = u.findAll(); 
		for(Usuario y : uo) {
			System.out.println(y.getNome());
		}
		
		
	}

}
