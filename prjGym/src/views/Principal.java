package views;

import dao.UsuarioDAO;
import models.Usuario;
import utils.ClearScreen;
import utils.Console;

public class Principal {
	
	private static Usuario u = new Usuario();
	
	public static void main(String[] args) {
		addPreUsers();
		loadTelaPrincipal();
	}
	
	public static void addPreUsers() {
		u = new Usuario();
		u.setDataNascimento("15/10/2000");
		u.setNome("Lucas Pereira");
		u.setPeso(62.00);
		u.setUsuario("lucaspgo");
		u.setSenha("mylittleponey");
		u.setTipo("1");
		
		UsuarioDAO.cadastrar(u);
		
		u = new Usuario();
		u.setDataNascimento("15/10/2000");
		u.setNome("Deborah Alynne");
		u.setPeso(62.00);
		u.setUsuario("debzinha");
		u.setSenha("bieber");
		u.setTipo("2");
		
		UsuarioDAO.cadastrar(u);
		
		u = new Usuario();
		u.setDataNascimento("15/10/2000");
		u.setNome("Gabriel Alex");
		u.setPeso(62.00);
		u.setUsuario("alekkk");
		u.setSenha("minecraft");
		u.setTipo("1");
		
		UsuarioDAO.cadastrar(u);
	}
	
	public static void loadTelaPrincipal() {
		ClearScreen.clear();
		int option;
		
		do {
			System.out.println("---SISTEMA DE LISTA DE ACADEMIA---");
			System.out.println("1 - ENTRAR");
			System.out.println("2 - CADASTRAR-SE");
			option = Console.readInt("\nDigite a opção desejada:");			
			
			switch(option) {
				case 1:
					LoginSistema.renderizar();
					break;
				case 2:
					Cadastro.renderizar();
					break;
			}
			
		}while(option != 0);
	}

}
