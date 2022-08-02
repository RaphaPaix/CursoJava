package Modulo8.Aulas;

import javax.swing.JOptionPane;

public class AulaAtual {
	//Aula 11
	public static void main(String[] args) {
		//entrada de dados
		String carro = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de pessoas");  
		//conversão de dados
		double carroNumero = Double.parseDouble(carro);
		double pessoaNumero = Double.parseDouble(pessoa);
		//processamento divisão e resto
		int divisao = (int)(carroNumero / pessoaNumero);
		double resto = carroNumero % pessoaNumero;
		//impressão dos dados
		System.out.println("A quantidade de carros é: " + carroNumero + " carro(s)");
		System.out.println("A quantidade de pessoas é: " + pessoaNumero + " pessoa(s)");
		System.out.println("Cada uma das " + pessoaNumero + " pessoa(s) receberá " + divisao + " carro(s)");
		System.out.println(resto + " carro(s) vão sobrar.");
	}
}
