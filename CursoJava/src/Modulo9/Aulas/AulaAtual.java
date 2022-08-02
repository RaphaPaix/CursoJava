package Modulo9.Aulas;

import Modulo9.classes.Aluno;

public class AulaAtual {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Joao da Silva");
		System.out.println("Nome é " + aluno1.getNome());
		aluno1.setNota1(20);
		aluno1.setNota2(60);
		aluno1.setNota3(70);
		aluno1.setNota4(90);
		System.out.println("A média do aluno é: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		//System.out.println("Resultado pelo método 2: " + aluno1.getAlunoAprovado2());
		Aluno aluno2 = new Aluno();	
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("Jose", 50);
	}
}
