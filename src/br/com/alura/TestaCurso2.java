package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		Curso curso = new Curso("Java Collections", "Paulo");

		curso.adiciona(new Aula("Trabalhando com Array list", 21));
		curso.adiciona(new Aula("Lista de objetos", 15));
		curso.adiciona(new Aula("Aula 3 - Relacionamentos com coleções", 22));
		
		List<Aula> aulasImutaveis = curso.getAulas();
		
		System.out.println(aulasImutaveis);
		
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		
		System.out.println(curso.getTempototal());
		
		System.out.println(curso);
	}

}
