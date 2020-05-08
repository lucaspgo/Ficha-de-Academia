package views;

import java.util.ArrayList;

import dao.FichaDAO;
import dao.GrupoMuscularDAO;
import models.Exercicio;
import models.GrupoMuscular;
import models.Usuario;
import utils.Console;

public class VisualizarExercicios {
	public static void renderizar(Usuario u, int diaSemana) {
		ListarGrupoMuscular.renderizar();
		int opcaoGrupoMuscular = Console.readInt("Escolha grupo muscular para ver:");
		
		GrupoMuscular grupoMuscularRetornado = GrupoMuscularDAO.retornarGrupoMuscularPorId(opcaoGrupoMuscular);
		
		if(grupoMuscularRetornado != null) {			
		ArrayList<Exercicio> exercicios = FichaDAO.retornarExercicios(grupoMuscularRetornado, u, diaSemana);
		if( exercicios != null) {
			for(Exercicio exercicio : exercicios) {
				System.out.println(exercicio.toString());
			}
		}else {
			System.out.println("N�o existem exerc�cios nessa semana");
		}
						
		}else {
			System.out.println("O grupo muscular especificado n�o existe, insira um v�lido");
		}
	}
	
	public static Boolean listarExercicios(int opcaoGrupoMuscular, int diaSemana, GrupoMuscular grupoMuscular) {
		
		return false;
	}
}
