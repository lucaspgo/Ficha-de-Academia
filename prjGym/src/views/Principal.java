package views;

import dao.GrupoMuscularDAO;
import dao.UsuarioDAO;
import models.GrupoMuscular;
import models.Usuario;
import utils.ClearScreen;
import utils.Console;

public class Principal {
	
	private static Usuario u = new Usuario();
	private static GrupoMuscular gp = new GrupoMuscular();
	
	public static void main(String[] args) {
		addPreUsers();
		loadTelaPrincipal();
	}
	
	public static void addPreUsers() {
		u = new Usuario();
		u.setDataNascimento("15/10/2000");
		u.setNome("Lucas Pereira");
		u.setPeso(62.00);
		u.setUsuario("lucaspgo");
		u.setSenha("mylittleponey");
		u.setTipo("1");
		
		UsuarioDAO.cadastrar(u);
		
		u = new Usuario();
		u.setDataNascimento("15/10/2000");
		u.setNome("Deborah Alynne");
		u.setPeso(62.00);
		u.setUsuario("debzinha");
		u.setSenha("bieber");
		u.setTipo("2");
		
		UsuarioDAO.cadastrar(u);
		
		u = new Usuario();
		u.setDataNascimento("15/10/2000");
		u.setNome("Gabriel Alex");
		u.setPeso(62.00);
		u.setUsuario("alekkk");
		u.setSenha("minecraft");
		u.setTipo("2");
		
		UsuarioDAO.cadastrar(u);
		
		gp = new GrupoMuscular();
		gp.setId(1);
		gp.setNome("Bíceps");
			
		GrupoMuscularDAO.cadastrar(gp);
		
		gp = new GrupoMuscular();
		gp.setId(2);
		gp.setNome("Tríceps");
			
		GrupoMuscularDAO.cadastrar(gp);
		
		gp = new GrupoMuscular();
		gp.setId(3);
		gp.setNome("Ombros");
			
		GrupoMuscularDAO.cadastrar(gp);
		
		gp = new GrupoMuscular();
		gp.setId(4);
		gp.setNome("Peito");
			
		GrupoMuscularDAO.cadastrar(gp);
		
		gp = new GrupoMuscular();
		gp.setId(5);
		gp.setNome("ABS");
			
		GrupoMuscularDAO.cadastrar(gp);
		
		gp = new GrupoMuscular();
		gp.setId(6);
		gp.setNome("Costas");
			
		GrupoMuscularDAO.cadastrar(gp);
		
		gp = new GrupoMuscular();
		gp.setId(7);
		gp.setNome("Inferiores");
			
		GrupoMuscularDAO.cadastrar(gp);
	}
	
	public static void loadTelaPrincipal() {
		int option;
		
		do {
			System.out.println("---SISTEMA DE LISTA DE ACADEMIA---");
			System.out.println("1 - ENTRAR");
			System.out.println("2 - CADASTRAR-SE");
			option = Console.readInt("\nDigite a opção desejada:");			
			
			switch(option) {
				case 1:
					LoginSistema.renderizar();
					break;
				case 2:
					Cadastro.renderizar();
					break;
			}
			
		}while(option != 0);
	}

}
