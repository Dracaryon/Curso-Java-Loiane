package com.loiane.cursojava.aula25a27exerc.Classes_e_Metodos.exerc3;

public class TesteAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.matricula = 1;
		aluno.nome = "Felipe";
		aluno.curso = "S.I";
		
		aluno.incluirDisciplinaNotas();
		aluno.verificarAprovacao();
		
	}

}