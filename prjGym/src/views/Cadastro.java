package views;

import dao.UsuarioDAO;
import models.Usuario;
import utils.Console;
import utils.ClearScreen;

public class Cadastro {
	public static Usuario usuario = new Usuario();
	
	public static void renderizar() {
		
		usuario = new Usuario();
		
		System.out.println("-- CADASTRO DE USUARIO NA FICHA DE ACADEMIA --");
		System.out.println("Preencha Login e Senha");
		String login = Console.readString("Usuario:");
		
		if(!UsuarioDAO.loginExiste(login)) {
			usuario.setUsuario(login);
			String senha = Console.readString("Senha:");
			usuario.setSenha(senha);
			usuario.setNome(Console.readString("Nome Completo:"));
			usuario.setDataNascimento(Console.readString("Data de Nascimento(dd/mm/yyyy)"));
			usuario.setPeso(Console.readDouble("Qual seu peso em kg?"));
			usuario.setTipo(Console.readString("Você é:\n1 - Professor\n2 - Aluno"));
			
			UsuarioDAO.cadastrar(usuario);
			Principal.loadTelaPrincipal();
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
