package dao;
import java.util.ArrayList;
import models.Usuario;

public class UsuarioDAO {
	
	private static Usuario usuarioSession = new Usuario();
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static Boolean loginExiste(String login) {
		for (Usuario usuarioCadastrado : usuarios) {
			if (usuarioCadastrado.getUsuario().equals(login)) {
				return true;
			}
		}
		return false;
	}
	
	public static void imprimir() {
		for (Usuario usuarioCadastrado : usuarios) {
			System.out.println(usuarioCadastrado.getNome());
		}
	}
	
	public static Boolean checkSenha(String login, String senha) {
		for (Usuario usuarioCadastrado : usuarios) {
			if (usuarioCadastrado.getUsuario().equals(login)) {
				if(usuarioCadastrado.getSenha().equals(senha)) {
					usuarioSession = usuarioCadastrado;
					return true;
				}
			}
		}
		return false;
	}
	
	public static Boolean cadastrar(Usuario u) {
		usuarios.add(u);
		
		return true;
	}
	
	public static Usuario infoUsuario() {		
		return usuarioSession;
	}
	
	public static Usuario retornarUsuarioPorUsername(String usuario) {
		for (Usuario usuarioCadastrado : usuarios) {
			if (usuarioCadastrado.getUsuario().equals(usuario)) {
				return usuarioCadastrado;
			}
		}
		return null;
	}
	
}
