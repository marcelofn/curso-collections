package br.com.alura;

import java.util.Set;

public class TestaAlunoComCursos {

	public static void main(String[] args) {
		Curso curso = new Curso("Java Collections", "Paulo");

		curso.adiciona(new Aula("Trabalhando com Array list", 21));
		curso.adiciona(new Aula("Lista de objetos", 15));
		curso.adiciona(new Aula("Aula 3 - Relacionamentos com cole��es", 22));

		Aluno a1 = new Aluno("Marcelo", 1234);
		Aluno a2 = new Aluno("Ana", 4321);
		Aluno a3 = new Aluno("Fabio", 2345);

		curso.matricula(a1);
		curso.matricula(a2);
		curso.matricula(a3);

		Set<Aluno> alunos = curso.getAlunos();

		System.out.println(alunos);

		System.out.println("Todos os alunos matriculados: ");
		curso.getAlunos().forEach(a -> {
			System.out.println(a);
		});
	}
}
