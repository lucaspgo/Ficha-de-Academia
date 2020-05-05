package dao;

import java.util.ArrayList;

import models.Exercicio;

public class ExercicioDAO {
	
	private static ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
	
	public static Boolean cadastrar(Exercicio e) {
		
		exercicios.add(e);
		return true;
		
	}

}
