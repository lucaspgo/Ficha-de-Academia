package views;

import dao.FichaDAO;
import dao.UsuarioDAO;
import models.Usuario;
import utils.Console;

public class VizualizarFicha {
	
	private static Usuario usuario = new Usuario();
	
	public static void renderizar() {
		String usuarioAluno = Console.readString("Qual o usuario do aluno?"); 
		if(UsuarioDAO.loginExiste(usuarioAluno)) {
			if(FichaDAO.usuarioTemFicha(usuarioAluno)) {
				usuario = UsuarioDAO.retornarUsuarioPorUsername(usuarioAluno);
				int semanaEscolhida;
				do {			
					System.out.println("1 - Segunda");
					System.out.println("2 - Terça");
					System.out.println("3 - Quarta");
					System.out.println("4 - Quinta");
					System.out.println("5 - Sexta");
					System.out.println("6 - Sábado");
					System.out.println("7 - Domingo");
					System.out.println("0 - VOLTAR PARA PÁGINA DE PROFESSOR");
					
					semanaEscolhida = Console.readInt("Selecione a semana:");					
					
					switch(semanaEscolhida) {
					
					case 1:
						VisualizarExercicios.renderizar(usuario, semanaEscolhida);
						break;
					case 2:
						
						break;
					case 3:						
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					default:
						break;
					
					}
				
				}while(semanaEscolhida != 0);
			}else {
				System.out.println("Este usuario não tem uma ficha, adicione uma para ele.");
			}
		}else {
			System.out.println("Este usuário não existe no sistema");
		}
	}
}
