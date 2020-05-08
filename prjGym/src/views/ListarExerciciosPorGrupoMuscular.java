package views;

import java.util.ArrayList;

import dao.ExercicioDAO;
import models.Exercicio;

public class ListarExerciciosPorGrupoMuscular {
	public static Boolean renderizar(int grupoMuscularEscolhido) {
		ArrayList<Exercicio> exerciciosEscolhidos = ExercicioDAO.listarExerciciosPorGrupoMuscular(grupoMuscularEscolhido);
		if(!exerciciosEscolhidos.isEmpty()) {
			for(Exercicio exercicio : exerciciosEscolhidos) {
				System.out.println(exercicio.toString());
			}
			return true;
		}else {
			System.out.println("Não há exercícios nesta sessão.");
			return false;
		}
	}
}
