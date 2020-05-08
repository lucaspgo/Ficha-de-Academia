package models;


public class Exercicio {
	private Integer id;
	private String nome;
	private GrupoMuscular grupoMuscular;
	private Integer numRepeticoes;
	private int peso;
	private int tempo;
	private int series;	
	
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public GrupoMuscular getGrupoMuscular() {
		return grupoMuscular;
	}
	public void setGrupoMuscular(GrupoMuscular grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}
	public Integer getNumRepeticoes() {
		return numRepeticoes;
	}
	public void setNumRepeticoes(Integer numRepeticoes) {
		this.numRepeticoes = numRepeticoes;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {		
		return getId() + " | " + getNome() + " | " + getGrupoMuscular().getNome();
	}
	
	
}
