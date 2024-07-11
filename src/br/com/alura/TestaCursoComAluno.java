package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		 Curso javaColecoes = new Curso("Dominando as colecoes do Java",
	                "Paulo Silveira");

	        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

	        Aluno a1 = new Aluno("Rodrigo turini", 34566);
	        Aluno a2 = new Aluno("Guilherme silveira", 54322);
	        Aluno a3 = new Aluno("Mauricio souza", 56436);
	        
	        
	        javaColecoes.matricula(a1);
	        javaColecoes.matricula(a2);
	        javaColecoes.matricula(a3);
	        
	        System.out.println("Todos os alunos matriculados: ");
	        javaColecoes.getAlunos().forEach(a -> {
	        	System.out.println(a);
	        });
	} 
}
