package Modulo9.Aulas;

import javax.swing.JOptionPane;

import Modulo9.classes.Aluno;

public class AulaAtual {
	public static void main(String[] args) {
		//intera�ao com usuario
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno? ");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
		//instancia
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		System.out.println("O nome do aluno � " + aluno1.getNome() + " de idade " + aluno1.getIdade() + " anos");
		aluno1.setNota1(20);
		aluno1.setNota2(60);
		aluno1.setNota3(70);
		aluno1.setNota4(90);
		System.out.println("A m�dia do aluno �: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		//System.out.println("Resultado pelo m�todo 2: " + aluno1.getAlunoAprovado2());
		Aluno aluno2 = new Aluno();	
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("Jose", 50);
		System.out.println(aluno1.toString());
	}
}
