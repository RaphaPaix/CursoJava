package Modulo8.Aulas;

import javax.swing.JOptionPane;

public class AulaAtual {
	//Aula 11
	public static void main(String[] args) {
		//entrada de dados
		String carro = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas");  
		//convers�o de dados
		double carroNumero = Double.parseDouble(carro);
		double pessoaNumero = Double.parseDouble(pessoa);
		//processamento divis�o e resto
		int divisao = (int)(carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;
		//impress�o dos dados
		System.out.println("A quantidade de carros �: " + carroNumero + " carro(s)");
		System.out.println("A quantidade de pessoas �: " + pessoaNumero + " pessoa(s)");
		System.out.println("Cada uma das " + pessoaNumero + " pessoa(s) receber� " + divisao + " carro(s)");
		System.out.println(resto + " carro(s) v�o sobrar.");
	}
}
