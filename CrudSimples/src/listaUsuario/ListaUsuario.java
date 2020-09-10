package listaUsuario;

import java.util.ArrayList;
import java.util.List;

import usuarioPessoa.Usuario;

public class ListaUsuario implements IListaUsuario{
	
	
	List<Usuario> listaUsuario = new ArrayList<Usuario>();

	@Override
	public boolean salvaUsuario(Usuario usuario) {
		try {
			listaUsuario.add(usuario);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public List<Usuario> listarUsuario() {
		
		return listaUsuario;
	}
	
}
