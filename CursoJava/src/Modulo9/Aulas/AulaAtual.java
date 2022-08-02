package Modulo9.Aulas;

import Modulo9.classes.Aluno;

public class AulaAtual {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao da Silva");
		System.out.println("Nome é " + aluno1.getNome());
		Aluno aluno2 = new Aluno();	
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("Jose", 50);
	}
}
