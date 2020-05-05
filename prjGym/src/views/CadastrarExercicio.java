package views;

import utils.Console;

import dao.GrupoMuscularDAO;
import models.Exercicio;
import models.GrupoMuscular;

public class CadastrarExercicio {
	
	private static GrupoMuscular grupoMuscular = new GrupoMuscular();
	
	private static Exercicio exercicio = new Exercicio();

	public static void renderizar(int grupoMuscularEscolhido) {
		grupoMuscular = new GrupoMuscular();
		
		exercicio = new Exercicio(); 
		
		GrupoMuscular grupoMuscularRetornado = GrupoMuscularDAO.retornarGrupoMuscularPorId(grupoMuscularEscolhido);
		
		grupoMuscular = grupoMuscularRetornado;
		
		exercicio.setGrupoMuscular(grupoMuscularRetornado);
		
		exercicio.setNome(Console.readString("Qual o nome do exercício?: "));
				
	}

}
