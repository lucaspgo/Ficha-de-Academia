package models;


public class Exercicio {
	private Integer id;
	private String nome;
	private GrupoMuscular grupoMuscular;
	private Integer numRepeticoes;
	private Double peso;
	
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
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
	
	
}
