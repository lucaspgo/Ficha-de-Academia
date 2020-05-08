package dao;

import java.util.ArrayList;

import models.Exercicio;
import models.Ficha;
import models.GrupoMuscular;
import models.Usuario;

public class FichaDAO {
	private static ArrayList<Ficha> fichas = new ArrayList<Ficha>();
	
	public static Boolean criarFicha(Ficha f) {
		for(Ficha ficha : fichas) {
			if(ficha.getUsuario().getUsuario().equals(f.getUsuario().getUsuario())) {
				return false;
			}
		}
		fichas.add(f);
		return true;		
	}
	
	public static Boolean usuarioTemFicha(String usuario) {
		for(Ficha ficha : fichas) {
			if(ficha.getUsuario().getUsuario().equals(usuario)){
				return true;
			}
		}
		return false;
	}
	
	public static Boolean adicionarExercicioaFicha(Exercicio e, Usuario u, int diaSemana) {
		switch(diaSemana) {
		case 1:
		
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosSeg = new ArrayList<Exercicio>();
					if(ficha.getExercicioSegunda() != null) {
						exerciciosSeg = ficha.getExercicioSegunda();
						exerciciosSeg.add(e);
						
						ficha.setExercicioSegunda(exerciciosSeg);
						return true;
					}
				}
			}
			return false;
		case 2:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosTer = new ArrayList<Exercicio>();
					if(ficha.getExercicioTerca() != null) {
						exerciciosTer = ficha.getExercicioTerca();
						exerciciosTer.add(e);
						
						ficha.setExercicioTerca(exerciciosTer);
						return true;
					}
				}
			}
			return false;
		case 3:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosQua = new ArrayList<Exercicio>();
					if(ficha.getExercicioQuarta() != null) {
						exerciciosQua = ficha.getExercicioQuarta();
						exerciciosQua.add(e);
						
						ficha.setExercicioQuarta(exerciciosQua);
						return true;
					}
				}
			}
			return false;
		case 4:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosQui = new ArrayList<Exercicio>();
					if(ficha.getExercicioQuinta() != null) {
						exerciciosQui = ficha.getExercicioQuinta();
						exerciciosQui.add(e);
						
						ficha.setExercicioQuinta(exerciciosQui);
						return true;
					}
				}
			}
			return false;
		case 5:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosSex = new ArrayList<Exercicio>();
					if(ficha.getExercicioSexta() != null) {
						exerciciosSex = ficha.getExercicioSexta();
						exerciciosSex.add(e);
						
						ficha.setExercicioSexta(exerciciosSex);
						return true;
					}
				}
			}
			return false;
		case 6:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosSab = new ArrayList<Exercicio>();
					if(ficha.getExercicioSabado() != null) {
						exerciciosSab = ficha.getExercicioSabado();
						exerciciosSab.add(e);
						
						ficha.setExercicioSabado(exerciciosSab);
						return true;
					}
				}
			}
			return false;
		case 7:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosDom = new ArrayList<Exercicio>();
					if(ficha.getExercicioDomingo() != null) {
						exerciciosDom = ficha.getExercicioDomingo();
						exerciciosDom.add(e);
						
						ficha.setExercicioDomingo(exerciciosDom);
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}
	
	public static Boolean excluirExercicioaFicha(Exercicio e, Usuario u, int diaSemana) {
		switch(diaSemana) {
		case 1:
		
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosSeg = new ArrayList<Exercicio>();
					if(ficha.getExercicioSegunda() != null) {
						exerciciosSeg = ficha.getExercicioSegunda();
						exerciciosSeg.remove(e);
						
						ficha.setExercicioSegunda(exerciciosSeg);
						return true;
					}
				}
			}
			return false;
		case 2:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosTer = new ArrayList<Exercicio>();
					if(ficha.getExercicioTerca() != null) {
						exerciciosTer = ficha.getExercicioTerca();
						exerciciosTer.remove(e);
						
						ficha.setExercicioTerca(exerciciosTer);
						return true;
					}
				}
			}
			return false;
		case 3:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosQua = new ArrayList<Exercicio>();
					if(ficha.getExercicioQuarta() != null) {
						exerciciosQua = ficha.getExercicioQuarta();
						exerciciosQua.remove(e);
						
						ficha.setExercicioQuarta(exerciciosQua);
						return true;
					}
				}
			}
			return false;
		case 4:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosQui = new ArrayList<Exercicio>();
					if(ficha.getExercicioQuinta() != null) {
						exerciciosQui = ficha.getExercicioQuinta();
						exerciciosQui.remove(e);
						
						ficha.setExercicioQuinta(exerciciosQui);
						return true;
					}
				}
			}
			return false;
		case 5:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosSex = new ArrayList<Exercicio>();
					if(ficha.getExercicioSexta() != null) {
						exerciciosSex = ficha.getExercicioSexta();
						exerciciosSex.remove(e);
						
						ficha.setExercicioSexta(exerciciosSex);
						return true;
					}
				}
			}
			return false;
		case 6:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosSab = new ArrayList<Exercicio>();
					if(ficha.getExercicioSabado() != null) {
						exerciciosSab = ficha.getExercicioSabado();
						exerciciosSab.remove(e);
						
						ficha.setExercicioSabado(exerciciosSab);
						return true;
					}
				}
			}
			return false;
		case 7:
			for(Ficha ficha : fichas) {
				if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
					ArrayList<Exercicio> exerciciosDom = new ArrayList<Exercicio>();
					if(ficha.getExercicioDomingo() != null) {
						exerciciosDom = ficha.getExercicioDomingo();
						exerciciosDom.remove(e);
						
						ficha.setExercicioDomingo(exerciciosDom);
						return true;
					}
				}
			}
			return false;
		}
		return false;
	}
	
	public static ArrayList<Exercicio> retornarExercicios(GrupoMuscular gm, Usuario u, int diaSemana) {
		switch(diaSemana) {
		case 1:
			if(!fichas.isEmpty()) {
				for(Ficha ficha : fichas) {
					if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
						ArrayList<Exercicio> exerciciosSelecionados = new ArrayList<Exercicio>();
						if(ficha.getExercicioSegunda() != null) {					
							ArrayList<Exercicio> exerciciosSeg = ficha.getExercicioSegunda();
							
							for(Exercicio exercicio : exerciciosSeg) {						
								if(exercicio.getGrupoMuscular().getId().equals(gm.getId())) {
									exerciciosSelecionados.add(exercicio);
								}
							}
						return exerciciosSelecionados;
						}
					}
				}
			}
			return null;
		case 2:
			if(!fichas.isEmpty()) {
				for(Ficha ficha : fichas) {
					if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
						ArrayList<Exercicio> exerciciosSelecionados = new ArrayList<Exercicio>();
						if(ficha.getExercicioTerca() != null) {					
							ArrayList<Exercicio> exerciciosTer = ficha.getExercicioTerca();
							
							for(Exercicio exercicio : exerciciosTer) {						
								if(exercicio.getGrupoMuscular().getId().equals(gm.getId())) {
									exerciciosSelecionados.add(exercicio);
								}
							}
						return exerciciosSelecionados;
						}
					}
				}
			}
			return null;
		case 3:
			if(!fichas.isEmpty()) {
				for(Ficha ficha : fichas) {
					if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
						ArrayList<Exercicio> exerciciosSelecionados = new ArrayList<Exercicio>();
						if(ficha.getExercicioQuarta() != null) {					
							ArrayList<Exercicio> exerciciosQua = ficha.getExercicioQuarta();
							
							for(Exercicio exercicio : exerciciosQua) {						
								if(exercicio.getGrupoMuscular().getId().equals(gm.getId())) {
									exerciciosSelecionados.add(exercicio);
								}
							}
						return exerciciosSelecionados;
						}
					}
				}
			}
			return null;
		case 4:
			if(!fichas.isEmpty()) {
				for(Ficha ficha : fichas) {
					if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
						ArrayList<Exercicio> exerciciosSelecionados = new ArrayList<Exercicio>();
						if(ficha.getExercicioQuinta() != null) {					
							ArrayList<Exercicio> exerciciosQui = ficha.getExercicioQuinta();
							
							for(Exercicio exercicio : exerciciosQui) {						
								if(exercicio.getGrupoMuscular().getId().equals(gm.getId())) {
									exerciciosSelecionados.add(exercicio);
								}
							}
						return exerciciosSelecionados;
						}
					}
				}
			}
			return null;
		case 5:
			if(!fichas.isEmpty()) {
				for(Ficha ficha : fichas) {
					if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
						ArrayList<Exercicio> exerciciosSelecionados = new ArrayList<Exercicio>();
						if(ficha.getExercicioSexta() != null) {					
							ArrayList<Exercicio> exerciciosSex = ficha.getExercicioSexta();
							
							for(Exercicio exercicio : exerciciosSex) {						
								if(exercicio.getGrupoMuscular().getId().equals(gm.getId())) {
									exerciciosSelecionados.add(exercicio);
								}
							}
						return exerciciosSelecionados;
						}
					}
				}
			}
			return null;
		case 6:
			if(!fichas.isEmpty()) {
				for(Ficha ficha : fichas) {
					if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
						ArrayList<Exercicio> exerciciosSelecionados = new ArrayList<Exercicio>();
						if(ficha.getExercicioSabado() != null) {					
							ArrayList<Exercicio> exerciciosSab = ficha.getExercicioSabado();
							
							for(Exercicio exercicio : exerciciosSab) {						
								if(exercicio.getGrupoMuscular().getId().equals(gm.getId())) {
									exerciciosSelecionados.add(exercicio);
								}
							}
						return exerciciosSelecionados;
						}
					}
				}
			}
			return null;
		case 7:
			if(!fichas.isEmpty()) {
				for(Ficha ficha : fichas) {
					if(ficha.getUsuario().getUsuario().equals(u.getUsuario())) {
						ArrayList<Exercicio> exerciciosSelecionados = new ArrayList<Exercicio>();
						if(ficha.getExercicioDomingo() != null) {					
							ArrayList<Exercicio> exerciciosDom = ficha.getExercicioDomingo();
							
							for(Exercicio exercicio : exerciciosDom) {						
								if(exercicio.getGrupoMuscular().getId().equals(gm.getId())) {
									exerciciosSelecionados.add(exercicio);
								}
							}
						return exerciciosSelecionados;
						}
					}
				}
			}
			return null;
		}
		return null;
	}
}
