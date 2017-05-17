package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java Collections", "Paulo");

		
		List<Aula> aulas = curso.getAulas();
		System.out.println(aulas);
		
		
		
		curso.adiciona(new Aula("Trabalhando com coleções", 21));
		
		
		System.out.println(aulas);
		
		System.out.println(curso.getAulas());
	}

}
