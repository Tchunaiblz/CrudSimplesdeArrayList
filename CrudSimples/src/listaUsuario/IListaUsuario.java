package listaUsuario;

import java.util.List;

import usuarioPessoa.Usuario;


public interface IListaUsuario {

			public boolean salvaUsuario(Usuario usuario);
			public List<Usuario> listarUsuario();
			
}
