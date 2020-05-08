package views;

import dao.ExercicioDAO;

public class ListarExercicioPorId {
	public static void renderizar(int idExercicio) {		
		if(ExercicioDAO.retornarExercicioPorId(idExercicio) != null)
			System.out.println(ExercicioDAO.retornarExercicioPorId(idExercicio).toString());
		else
			System.out.println("Este exerc�cio n�o existe, selecione um exerc�cio valido!");
	}
}
