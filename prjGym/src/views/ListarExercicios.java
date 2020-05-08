package views;

public class ListarExercicios {
	public static void renderizar(int grupoMuscularEscolhido) {
		ListarExerciciosPorGrupoMuscular.renderizar(grupoMuscularEscolhido);
		System.out.println("0 - VOLTAR\n");
	}
}
