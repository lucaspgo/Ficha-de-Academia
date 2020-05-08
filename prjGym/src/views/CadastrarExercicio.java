package views;

import utils.Console;
import dao.ExercicioDAO;
import dao.GrupoMuscularDAO;
import models.Exercicio;
import models.GrupoMuscular;

public class CadastrarExercicio {
	
	private static Exercicio exercicio = new Exercicio();

	public static void renderizar(int grupoMuscularEscolhido) {
		
		exercicio = new Exercicio(); 
		
		GrupoMuscular grupoMuscularRetornado = GrupoMuscularDAO.retornarGrupoMuscularPorId(grupoMuscularEscolhido);
		
		if(grupoMuscularRetornado != null) {
			
			exercicio.setGrupoMuscular(grupoMuscularRetornado);
			
			exercicio.setNome(Console.readString("Qual o nome do exerc�cio?: "));
			
			if(ExercicioDAO.cadastrar(exercicio)) {
				System.out.println("Exerc�cio cadastrado com sucesso!");			
			}
			else {
				System.out.println("Algo deu errado, contacte a equipe de desenvolvimento");
			}
		}else {
			System.out.println("O grupo muscular especificado n�o existe, insira um v�lido");
		}
		
		
		
				
	}

}
