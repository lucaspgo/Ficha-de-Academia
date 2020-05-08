package views;

import dao.FichaDAO;
import dao.UsuarioDAO;
import models.Ficha;
import utils.Console;

public class CadastrarFicha {
	
	private static Ficha ficha = new Ficha();
	
	public static void renderizar() {
		ficha = new Ficha();
		
		String usuarioAluno = Console.readString("Qual o usuario do aluno?"); 
		if(UsuarioDAO.loginExiste(usuarioAluno)) {
			
			ficha.setUsuario(UsuarioDAO.retornarUsuarioPorUsername(usuarioAluno));
			if(FichaDAO.criarFicha(ficha)) {
				System.out.println("Ficha do aluno(a) " + UsuarioDAO.retornarUsuarioPorUsername(usuarioAluno).getNome() + " criada com sucesso!");
			}else {
				System.out.println("Este usuário já tem uma ficha, altere sua respectiva ficha.");
			}
		}else {
			System.out.println("Este usuário não existe no sistema, insira um usuário válido.\n");
		}
	}
}
