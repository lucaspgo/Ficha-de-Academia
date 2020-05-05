package views;

import models.Usuario;

public class PaginaInicial {
	public static void renderizar(Usuario sessionUsuario) {
		if(sessionUsuario.getTipo().equals("1"))
			menuProfessor();
		else
			menuAluno();
		
		
	}
	
	public static void menuAluno() {
		
	}
	
	public static void menuProfessor() {
		
	}
}
