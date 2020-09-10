package com.github.tchunaiblz.prog2.CrudSimples;

import java.util.ArrayList;
import java.util.List;

import listaUsuario.ListaUsuario;
import usuarioPessoa.Usuario;
public class Tela {
	static ListaUsuario lt = new ListaUsuario();
		public static void main(String[] args) {
			Listados();
			listarUsuarios();
		}
			
			public static void Listados(){
				
				Usuario usuario = new Usuario();
				usuario.setId(1);
				usuario.setNome("Matheus");
				usuario.setEmail("matheus@gmail.com");
				usuario.setCargo("Vendedor");
				lt.salvaUsuario(usuario);
				
				Usuario usuario1 = new Usuario();
				usuario1.setId(2);
				usuario1.setNome("Julia");
				usuario1.setEmail("Julia@gmail.com");
				usuario1.setCargo("Marketing");
				lt.salvaUsuario(usuario1);
	
				Usuario usuario2 = new Usuario();
				usuario2.setId(3);
				usuario2.setNome("Ana");
				usuario2.setEmail("Ana@gmail.com");
				usuario2.setCargo("Reporter");
				lt.salvaUsuario(usuario2);
				
				Usuario usuario3 = new Usuario();
				usuario3.setId(4);
				usuario3.setNome("Paulo");
				usuario3.setEmail("Paulo@gmail.com");
				usuario3.setCargo("Telemarketing");
				lt.salvaUsuario(usuario3);
				
				Usuario usuario4 = new Usuario();
				usuario4.setId(5);
				usuario4.setNome("Wallace");
				usuario4.setEmail("Wallace@gmail.com");
				usuario4.setCargo("Programador");
				lt.salvaUsuario(usuario4);
		}		
		
	
		public static void listarUsuarios(){
			List<Usuario> lista = new ArrayList<Usuario>();
				lista = lt.listarUsuario();
					for(Usuario usuario : lista) {
						System.out.println("id: " + usuario.getId());
						System.out.println("Nome: " + usuario.getNome());
						System.out.println("Email: " + usuario.getEmail());
						System.out.println("Cargo: " + usuario.getCargo());
						System.out.println("<---------------------------->");
					}
		}
		
}
