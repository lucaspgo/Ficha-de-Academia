package views;

import dao.ExercicioDAO;
import models.Exercicio;
import utils.Console;

public class ExcluirExercicio {
	
	Exercicio exercicio = new Exercicio();
	
	public static void renderizar(int grupoMuscularEscolhido) {			
		
		ListarExerciciosPorGrupoMuscular.renderizar(grupoMuscularEscolhido);
		System.out.println("0 - VOLTAR");
		
		int idExercicio = Console.readInt("Qual exerc�cio voc� deseja excluir?\n");
		
		switch (idExercicio) {
		case 0:
			break;

		default:
	
			if(ExercicioDAO.excluirExercicio(idExercicio) != null) {
				System.out.println("Exerc�cio excluido com sucesso!");					
			}else {
				System.out.println("Este exerc�cio n�o existe, selecione um exerc�cio v�lido");
				renderizar(grupoMuscularEscolhido);
			}			
			break;
		}
		
	}

}
