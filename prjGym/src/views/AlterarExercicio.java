package views;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import dao.ExercicioDAO;
import dao.GrupoMuscularDAO;
import models.Exercicio;
import models.GrupoMuscular;
import utils.Console;

public class AlterarExercicio {
	
	private static GrupoMuscular grupoMuscular = new GrupoMuscular();
	
	private static Exercicio exercicio = new Exercicio();
	
	public static void renderizar(int grupoMuscularEscolhido) {
		grupoMuscular = new GrupoMuscular();

		exercicio = new Exercicio();
		
		GrupoMuscular grupoMuscularRetornado = GrupoMuscularDAO.retornarGrupoMuscularPorId(grupoMuscularEscolhido);
		
		if(grupoMuscularRetornado != null) {
			//exercicio.setGrupoMuscular(grupoMuscularRetornado);			
			
			ListarExerciciosPorGrupoMuscular.renderizar(grupoMuscularEscolhido);
			System.out.println("0 - VOLTAR");
			
			int idExercicio = Console.readInt("Qual exercício você deseja alterar?\n");
			
			switch (idExercicio) {
			case 0:
				break;

			default:
				Exercicio exercicioRetornado = ExercicioDAO.retornarExercicioPorId(idExercicio);
				if(exercicioRetornado != null) {
					System.out.println(exercicioRetornado.toString());
					exercicioRetornado.setNome(Console.readString("Escreva a sua alteração/nNome:"));
					if(ExercicioDAO.alterarExercicio(exercicioRetornado)) {
						System.out.println("Exercício salvo com sucesso!");
					}else {
						System.out.println("Houve um erro interno, contacte o time de desenvolvimento");
					}					
				}else {
					System.out.println("Este exercício não existe, selecione um exercício válido");
					renderizar(grupoMuscularEscolhido);
				}
				
				ListarExercicioPorId.renderizar(idExercicio);
				break;
			}
			
						
		}else {
			System.out.println("O grupo muscular especificado não existe, insira um válido");
		}
	}
}
