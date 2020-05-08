package views;

import dao.ExercicioDAO;
import dao.FichaDAO;
import dao.GrupoMuscularDAO;
import models.Exercicio;
import models.GrupoMuscular;
import models.Usuario;
import utils.Console;

public class AdicionarExercicioAFicha{
	public static void renderizar(Usuario u, int diaSemana) {		
		ListarGrupoMuscular.renderizar();
		int opcaoGrupoMuscular = Console.readInt("Escolha grupo muscular para adicionar:");
		
		GrupoMuscular grupoMuscularRetornado = GrupoMuscularDAO.retornarGrupoMuscularPorId(opcaoGrupoMuscular);
		
		if(grupoMuscularRetornado != null) {			
			
			if(ListarExerciciosPorGrupoMuscular.renderizar(opcaoGrupoMuscular)) {
			
				int idExercicio = Console.readInt("Qual exercício você deseja adicionar à ficha?\n");
				
				switch (idExercicio) {
				case 0:
					break;
	
				default:
					Exercicio exercicioRetornado = ExercicioDAO.retornarExercicioPorId(idExercicio);
					if(exercicioRetornado != null) {
						FichaDAO.adicionarExercicioaFicha(exercicioRetornado, u, diaSemana);					
						
						System.out.println("Exercício salvo com sucesso!");
											
					}else{
						System.out.println("Este exercício não existe, selecione um exercício válido");
						renderizar(u, diaSemana);
					}
					break;
				}			
		}else {
			
		}
						
		}else {
			System.out.println("O grupo muscular especificado não existe, insira um válido");
		}
			
	}
}

