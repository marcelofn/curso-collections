package br.com.alura;

public class Aluno {
	private String nome;
	private int matricula;

	public Aluno(String nome, int matricula) {
		if (nome == null) {
			throw new NullPointerException("O nome do aluno nao pode estar vazio");
		}
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + this.nome + ", matricula=" + this.matricula + "]";
	}

}
