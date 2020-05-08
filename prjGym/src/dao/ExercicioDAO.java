package dao;

import java.util.ArrayList;
import models.Exercicio;

public class ExercicioDAO {
	
	private static ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
	
	public static Boolean cadastrar(Exercicio e) {
		int lastId = 0;
		for(Exercicio exercicio : exercicios) {
			lastId = exercicio.getId();
		}
		e.setId(lastId + 1);
		exercicios.add(e);
		return true;		
	}
	
	public static Integer returnUltimoId() {
		Integer ultimoId = null;
		for(Exercicio exercicio : exercicios) {
			ultimoId = exercicio.getId();
		}
		return ultimoId;
	}
	
	public static ArrayList<Exercicio> listarExerciciosPorGrupoMuscular(int id){
		ArrayList<Exercicio> new_exercicio = new ArrayList<Exercicio>();
		
		for (Exercicio exercicio : exercicios) {			
			if (exercicio.getGrupoMuscular().getId().equals(id)) {
				new_exercicio.add(exercicio);
			}
		}
		return new_exercicio;
	}
	
	public static Boolean alterarExercicio(Exercicio e) {
		for(Exercicio exercicio : exercicios) {
			if(exercicio.getId().equals(e.getId())) {
				exercicio.setNome(e.getNome());
				return true;
			}
		}
		return false;
	}
	
	public static Exercicio retornarExercicioPorId(int idExercicio) {
		for (Exercicio exercicio : exercicios) {			
			if (exercicio.getId().equals(idExercicio)) {
				return exercicio;
			}
		}
		return null;
	}
	
	public static Boolean excluirExercicio(int idExercicio) {
		for(Exercicio exercicio : exercicios) {
			if(exercicio.getId().equals(idExercicio)) {
				exercicios.remove(exercicio);
				return true;
			}
		}
		return false;
	}

}
