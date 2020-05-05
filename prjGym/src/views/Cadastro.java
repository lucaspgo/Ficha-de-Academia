package views;

import dao.UsuarioDAO;
import utils.Console;
import utils.ClearScreen;

public class Cadastro {
	public static void renderizar() {
		ClearScreen.clear();
		
		System.out.println("-- CADASTRO DE USUARIO NA FICHA DE ACADEMIA --");
		System.out.println("Preencha Login e Senha");
		String login = Console.readString("Usuario:");
		
		if(!UsuarioDAO.loginExiste(login)) {
			
		}
		else 
		{
			System.out.println("Login já existente, cadastre outro login para uso.");
			int opcao = Console.readInt("1 - Inserir login novamente\n 2 - Voltar para a página inicial");
			switch(opcao) {
			case 1:
				renderizar();
				break;
			case 2:
				Principal.loadTelaPrincipal();
				break;
			}
		}
		
	}
}
