package views;

import dao.UsuarioDAO;
import utils.Console;
import utils.ClearScreen;
public class LoginSistema 
{
	public static void renderizar() 
	{
		ClearScreen.clear();
		String login = Console.readString("Login:");
		
		if(UsuarioDAO.loginExiste(login)) {
			
			String senha = Console.readString("Senha:");
			
			if(UsuarioDAO.checkSenha(login, senha)) {
				PaginaInicial.renderizar(UsuarioDAO.infoUsuario());
			}
			else {
				System.out.println("Senha incorreta, insira sua senha novamente.\n");				
				int opcao = Console.readInt("\n1 -  Realizar login novamente\n2 - Voltar para a página inicial");
				
				switch(opcao) {
					case 1:
						renderizar();
						break;
					default:
						Principal.loadTelaPrincipal();
						break;
				}
			}			
		}
		else
		{
			System.out.println("Este usuario não existe, insisra seu nome de usuário corretamente.\n");
			int opcao = Console.readInt("\n1 - Tentar Novamente\n2 - Voltar para a página inicial");
			switch(opcao) {
				case 1:
					renderizar();
					break;
				default:
					Principal.loadTelaPrincipal();
					break;
					
			}
		}
		
		
		
	}
}
