package br.com.alura;

import java.util.ArrayList;

public class TestaColecoes {

	public static void main(String[] args) {

		String curso1 = "Docker";
		String curso2 = "JBoss";
		String curso3 = "LDAP";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		System.out.println(cursos);

	}

}