package br.com.alura;

import java.util.HashSet;
 import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo turinii");
		alunos.add("alberto souza");
		alunos.add("walther silva");
		alunos.add("ellen bernado");
		alunos.add("marcelo rocha");
		alunos.add("rafael silva");
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		System.out.println(alunos);
	}

}
