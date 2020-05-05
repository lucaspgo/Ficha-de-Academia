package views;

import models.Usuario;
import utils.Console;

public class PaginaInicial {
	public static void renderizar(Usuario sessionUsuario) {
		if(sessionUsuario.getTipo().equals("1"))
			menuProfessor(sessionUsuario);
		else
			menuAluno(sessionUsuario);
	}
	
	public static void menuAluno(Usuario sessionUsuario) {
		System.out.println("--- SEJA BEM-VINDO ALUNO(A)" +sessionUsuario.getNome().toUpperCase()+" ---");
		System.out.println("1 - VER FICHA");
		System.out.println("2 - SAIR");
		int opcao = Console.readInt("Selecione a opção desejada:");
		
		switch(opcao) {
			case 1:
				break;
				
			case 2:
				break;				
		}		
	}
	
	public static void menuProfessor(Usuario sessionUsuario) {
		System.out.println("--- SEJA BEM-VINDO PROFESSOR(A) "+sessionUsuario.getNome().toUpperCase()+"() ---");
		System.out.println("1 - MONTAR FICHA");
		System.out.println("2 - CADASTRAR EXERCÍCIOS");
		System.out.println("3 - ALTERAR USUARIO");
		
		int opcao = Console.readInt("Selecione a opção desejada:");
		
		switch(opcao) {
			case 1:				
				break;
				
			case 2:
				ListarGrupoMuscular.renderizar();
				int opcaoGrupoMuscular = Console.readInt("Selecione o grupo muscular que você deseja adicionar:");
				CadastrarExercicio.renderizar(opcaoGrupoMuscular); 
				
					
				break;				
		}
	}
}
