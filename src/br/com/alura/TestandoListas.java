package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {
	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cusrsos e sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);

		aulas.remove(0);

		for (String aula : aulas) {
			System.out.println("Aulas: " + aula);
		}

		String primeiraaula = aulas.get(0);
		System.out.println("A primeira é " + primeiraaula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aulas: " + aulas.get(i));
		}

		System.out.println(aulas.size());

		aulas.forEach(aula -> {
			System.out.println("percorrendo:");
			System.out.println("Aula " + aula);
		});
		
		aulas.add("Aumentando meus conhecimentos");
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}
