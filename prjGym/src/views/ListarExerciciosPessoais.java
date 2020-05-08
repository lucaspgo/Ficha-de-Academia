package views;

import dao.FichaDAO;
import dao.UsuarioDAO;
import models.Usuario;
import utils.Console;

public class ListarExerciciosPessoais {
	
	private static Usuario usuario = new Usuario();
	
	public static void renderizar() {
		usuario = UsuarioDAO.infoUsuario(); 
			if(FichaDAO.usuarioTemFicha(usuario.getNome())) {
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
						VisualizarExercicios.renderizar(usuario, semanaEscolhida);
						break;
					case 3:						
						VisualizarExercicios.renderizar(usuario, semanaEscolhida);
						break;
					case 4:
						VisualizarExercicios.renderizar(usuario, semanaEscolhida);
						break;
					case 5:
						VisualizarExercicios.renderizar(usuario, semanaEscolhida);
						break;
					case 6:
						VisualizarExercicios.renderizar(usuario, semanaEscolhida);
						break;
					case 7:
						VisualizarExercicios.renderizar(usuario, semanaEscolhida);
						break;
					default:
						break;
					
					}
				
				}while(semanaEscolhida != 0);
			}else {
				System.out.println("Você não tem uma ficha, peça para o professor.");
			}
	}
}
