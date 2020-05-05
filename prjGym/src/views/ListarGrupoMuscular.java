package views;

import java.util.ArrayList;

import dao.GrupoMuscularDAO;
import models.GrupoMuscular;

public class ListarGrupoMuscular {
	public static void renderizar() {
		
		ArrayList<GrupoMuscular> gruposMusculares = GrupoMuscularDAO.listarGrupoMuscular();
		
		for (GrupoMuscular grupoMuscularCadastrado : gruposMusculares) {
			System.out.println(grupoMuscularCadastrado.getId() + " - " + grupoMuscularCadastrado.getNome());
		}
		
	}

}
		