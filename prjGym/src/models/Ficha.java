package models;

import java.util.ArrayList;

public class Ficha {
	private Usuario usuario;
	private ArrayList<Exercicio> exercicioDomingo;
	private ArrayList<Exercicio> exercicioSegunda;
	private ArrayList<Exercicio> exercicioTerca;
	private ArrayList<Exercicio> exercicioQuarta;
	private ArrayList<Exercicio> exercicioQuinta;
	private ArrayList<Exercicio> exercicioSexta;
	private ArrayList<Exercicio> exercicioSabado;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public ArrayList<Exercicio> getExercicioDomingo() {
		return exercicioDomingo;
	}
	public void setExercicioDomingo(ArrayList<Exercicio> exercicioDomingo) {
		this.exercicioDomingo = exercicioDomingo;
	}
	public ArrayList<Exercicio> getExercicioSegunda() {
		return exercicioSegunda;
	}
	public void setExercicioSegunda(ArrayList<Exercicio> exercicioSegunda) {
		this.exercicioSegunda = exercicioSegunda;
	}
	public ArrayList<Exercicio> getExercicioTerca() {
		return exercicioTerca;
	}
	public void setExercicioTerca(ArrayList<Exercicio> exercicioTerca) {
		this.exercicioTerca = exercicioTerca;
	}
	public ArrayList<Exercicio> getExercicioQuarta() {
		return exercicioQuarta;
	}
	public void setExercicioQuarta(ArrayList<Exercicio> exercicioQuarta) {
		this.exercicioQuarta = exercicioQuarta;
	}
	public ArrayList<Exercicio> getExercicioQuinta() {
		return exercicioQuinta;
	}
	public void setExercicioQuinta(ArrayList<Exercicio> exercicioQuinta) {
		this.exercicioQuinta = exercicioQuinta;
	}
	public ArrayList<Exercicio> getExercicioSexta() {
		return exercicioSexta;
	}
	public void setExercicioSexta(ArrayList<Exercicio> exercicioSexta) {
		this.exercicioSexta = exercicioSexta;
	}
	public ArrayList<Exercicio> getExercicioSabado() {
		return exercicioSabado;
	}
	public void setExercicioSabado(ArrayList<Exercicio> exercicioSabado) {
		this.exercicioSabado = exercicioSabado;
	}
	
}
