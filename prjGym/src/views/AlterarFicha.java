package views;

import dao.FichaDAO;
import dao.UsuarioDAO;
import models.Usuario;
import utils.Console;

public class AlterarFicha {
	
	private static Usuario usuario = new Usuario();
	
	public static void renderizar() {
		String usuarioAluno = Console.readString("Qual o usuario do aluno?"); 
		if(UsuarioDAO.loginExiste(usuarioAluno)) {
			if(FichaDAO.usuarioTemFicha(usuarioAluno)) {
				usuario = UsuarioDAO.retornarUsuarioPorUsername(usuarioAluno);
				int semanaEscolhida;
				do {			
					System.out.println("1 - Segunda");
					System.out.println("2 - Terça");
					System.out.println("3 - Quarta");
					System.out.println("4 - Quinta");
					System.out.println("5 - Sexta");
					System.out.println("6 - Sábado");
					System.out.println("7 - Domingo");
					System.out.println("0 - VOLTAR PARA PÁGINA DE PROFESSOR");
					
					semanaEscolhida = Console.readInt("Selecione a semana:");
					int opcao;
					
					switch(semanaEscolhida) {
					
					case 1:
						do {
							System.out.println("1 - Adicionar Exercicio na Segunda");
							System.out.println("2 - Excluir Exercicio na Segunda");
							System.out.println("0 - VOLTAR\n");
							
							opcao = Console.readInt("");					
							switch(opcao) {
								case 1:
									AdicionarExercicioAFicha.renderizar(usuario, semanaEscolhida);
									break;
								case 2:
									ExcluirExercicioFicha.renderizar(usuario, semanaEscolhida);
									break;
							}
						}while(opcao != 0);
						break;
					case 2:
						do {
							System.out.println("1 - Adicionar Exercicio na Terça");
							System.out.println("2 - Excluir Exercicio na Terça");
							System.out.println("0 - VOLTAR\n");
							
							opcao = Console.readInt("");					
							switch(opcao) {
								case 1:
									AdicionarExercicioAFicha.renderizar(usuario, semanaEscolhida);
									break;
								case 2:
									ExcluirExercicioFicha.renderizar(usuario, semanaEscolhida);
									break;
							}				
						}while(opcao != 0);
						break;
					case 3:
						do {
							System.out.println("1 - Adicionar Exercicio na Quarta");
							System.out.println("2 - Excluir Exercicio na Quarta\n");
							System.out.println("0 - VOLTAR\n");
							
							opcao = Console.readInt("");					
							switch(opcao) {
								case 1:
									AdicionarExercicioAFicha.renderizar(usuario, semanaEscolhida);
									break;
								case 2:
									ExcluirExercicioFicha.renderizar(usuario, semanaEscolhida);
									break;
							}
						}while(opcao != 0);
						break;
					case 4:
						do {
							System.out.println("1 - Adicionar Exercicio na Quinta");
							System.out.println("2 - Excluir Exercicio na Quinta\n");
							System.out.println("0 - VOLTAR\n");
							
							opcao = Console.readInt("");					
							switch(opcao) {
								case 1:
									AdicionarExercicioAFicha.renderizar(usuario, semanaEscolhida);
									break;
								case 2:
									ExcluirExercicioFicha.renderizar(usuario, semanaEscolhida);
									break;
							}
						}while(opcao != 0);
						break;
					case 5:
						do {
							System.out.println("1 - Adicionar Exercicio na Sexta");
							System.out.println("2 - Excluir Exercicio na Sexta\n");
							System.out.println("0 - VOLTAR\n");
							
							opcao = Console.readInt("");					
							switch(opcao) {
								case 1:
									AdicionarExercicioAFicha.renderizar(usuario, semanaEscolhida);
									break;
								case 2:
									ExcluirExercicioFicha.renderizar(usuario, semanaEscolhida);
									break;
							}
						}while(opcao != 0);
						break;
					case 6:
						do {
							System.out.println("1 - Adicionar Exercicio na Sabado");
							System.out.println("2 - Excluir Exercicio na Sabado\n");
							System.out.println("0 - VOLTAR\n");
							
							opcao = Console.readInt("");					
							switch(opcao) {
								case 1:
									AdicionarExercicioAFicha.renderizar(usuario, semanaEscolhida);
									break;
								case 2:
									ExcluirExercicioFicha.renderizar(usuario, semanaEscolhida);
									break;
							}
						}while(opcao != 0);
						break;
					case 7:
						do {
							System.out.println("1 - Adicionar Exercicio na Domingo");
							System.out.println("2 - Excluir Exercicio na Domingo\n");
							System.out.println("0 - VOLTAR\n");
							
							opcao = Console.readInt("");					
							switch(opcao) {
								case 1:
									AdicionarExercicioAFicha.renderizar(usuario, semanaEscolhida);
									break;
								case 2:
									ExcluirExercicioFicha.renderizar(usuario, semanaEscolhida);
									break;
							}
						}while(opcao != 0);
						break;
					default:
						break;
					
					}
				
				}while(semanaEscolhida != 0);
			}else {
				System.out.println("Este usuario não tem uma ficha, adicione uma para ele.");
			}
		}else {
			System.out.println("Este usuário não existe no sistema");
		}
	}
}
