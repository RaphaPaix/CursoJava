package Modulo9.Aulas;

import javax.swing.JOptionPane;

import Modulo9.classes.Aluno;
import Modulo9.classes.Disciplina;

public class AulaAtual {
	public static void main(String[] args) {
		/*
		//interaçao com usuario
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
		//instancia
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		System.out.println("O nome do aluno é " + aluno1.getNome() + " de idade " + aluno1.getIdade() + " anos");
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
		System.out.println(aluno1.toString());
		*/
		//equals e hashcode
		/*
		Aluno alunoA = new Aluno();
		Aluno alunoB = new Aluno();
		alunoA.setNome("Rapha");
		alunoB.setNome("Rapha");
		alunoA.setIdade(22);
		alunoB.setIdade(22);
		if(alunoA.equals(alunoB)) {
			System.out.println("Alunos iguais");
		}else {
			System.out.println("Alunos diferentes");
		}
		*/
		Aluno a = new Aluno();
		a.setNome("Rapha");
		a.setIdade(22);
		a.getDisciplina().setNota1(75);
		a.getDisciplina().setNota2(90);
		a.getDisciplina().setNota3(85);
		a.getDisciplina().setNota4(65);
		a.getDisciplina().setDisciplina1("Matematica");
		a.getDisciplina().setDisciplina2("Ciencias");
		a.getDisciplina().setDisciplina3("Historia");
		a.getDisciplina().setDisciplina4("Portugues");
		System.out.println("A média do aluno é: " + a.getMediaNota());;
		System.out.println("Resultado: " + (a.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println(a.toString());
	}
}
