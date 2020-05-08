package dao;

import java.util.ArrayList;

import models.GrupoMuscular;

public class GrupoMuscularDAO {
		
	private static ArrayList<GrupoMuscular> gruposMusculares = new ArrayList<GrupoMuscular>();
	
	public static ArrayList<GrupoMuscular> listarGrupoMuscular() {
			
		return gruposMusculares;
	}
	
	public static void cadastrar(GrupoMuscular gp) {
		gruposMusculares.add(gp);		
	}
	
	public static GrupoMuscular retornarGrupoMuscularPorId(int id) {
		for (GrupoMuscular grupoMuscular : gruposMusculares) {
		
			if (grupoMuscular.getId().equals(id)) {
				return grupoMuscular;
			}
		}
		return null;
		
	}
	
}
