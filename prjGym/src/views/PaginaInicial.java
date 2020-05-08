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
		int opcao;
		do {
			System.out.println("--- SEJA BEM-VINDO ALUNO(A)" +sessionUsuario.getNome().toUpperCase()+" ---");
			System.out.println("1 - VER FICHA");
			System.out.println("2 - SAIR");
			opcao = Console.readInt("Selecione a opção desejada:");
			
			switch(opcao) {
				case 1:
					ListarExerciciosPessoais.renderizar();
					break;
					
				case 2:
					break;				
			}
			
		}while(opcao != 0);
	}
	
	public static void menuProfessor(Usuario sessionUsuario) {
		int opcao;
		do {
			System.out.println("--- SEJA BEM-VINDO PROFESSOR(A) "+sessionUsuario.getNome().toUpperCase()+" ---");
			System.out.println("1 - FICHA");
			System.out.println("2 - EXERCÍCIOS");
			
			opcao = Console.readInt("Selecione a opção desejada:");
			
			switch(opcao) {
				case 1:
					menuFicha();
					break;
					
				case 2:
					menuExercicio();
					break;				
			}
		}while(opcao != 0);
	}
	
	public static void menuExercicio() {
		int opcao;
		do {
			System.out.println("\n--- MENU EXERCÍCIOS ---");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - ALTERAR");
			System.out.println("3 - EXCLUIR");
			System.out.println("4 - LISTAR");
			System.out.println("0 - VOLTAR PARA PÁGINA DE PROFESSOR");
			
			opcao = Console.readInt("Selecione a opção desejada:");
			int opcaoGrupoMuscular;
			switch(opcao) {
				case 1:
					ListarGrupoMuscular.renderizar();
					opcaoGrupoMuscular = Console.readInt("Selecione um grupo muscular para adicionar:");					
					CadastrarExercicio.renderizar(opcaoGrupoMuscular);
					break;					
				case 2:
					ListarGrupoMuscular.renderizar();
					opcaoGrupoMuscular = Console.readInt("Selecione um grupo muscular para alterar o exercício:");					
					AlterarExercicio.renderizar(opcaoGrupoMuscular);
					break;
				case 3:
					ListarGrupoMuscular.renderizar();
					opcaoGrupoMuscular = Console.readInt("Selecione um grupo muscular para excluir o exercício:");					
					ExcluirExercicio.renderizar(opcaoGrupoMuscular);
					break;
				case 4:					
					ListarGrupoMuscular.renderizar();
					opcaoGrupoMuscular = Console.readInt("Selecione um grupo muscular para vizualizar o exercício:");					
					ListarExerciciosPorGrupoMuscular.renderizar(opcaoGrupoMuscular);
					break;
				default:
					break;
			}
			
		}while(opcao != 0);
	}
	
	public static void menuFicha() {
		int opcao;
		do {
			System.out.println("\n--- MENU FICHA ---");
			System.out.println("1 - CRIAR FICHA");
			System.out.println("2 - ALTERAR INFORMAÇÕES FICHA");
			System.out.println("3 - VISUALIZAR FICHA");
			System.out.println("0 - VOLTAR PARA PÁGINA DE PROFESSOR");
			
			opcao = Console.readInt("Selecione a opção desejada:");
			
			switch (opcao) {
				case 1:
					CadastrarFicha.renderizar();
					break;
				case 2:
					AlterarFicha.renderizar();
					break;
				case 3:
					VizualizarFicha.renderizar();
					break;
				default:
					break;
			}
		
		}while(opcao != 0);
		
		
	}
}
