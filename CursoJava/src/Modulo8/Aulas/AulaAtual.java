package Modulo8.Aulas;

import javax.swing.JOptionPane;

public class AulaAtual {
	//Aula 11 e 12
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
		//confirmaçao de dialogo 0-sim 1-nao 2-cancel
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao por pessoa deu: " + divisao);
		}else {
			System.out.println("Nao quis ver o resultado.");
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto?");
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sobraram " + resto + " carros");
		}else {
			System.out.println("Nao quis ver o resultado.");
		}
		/*
		//impressão dos dados
		System.out.println("A quantidade de carros é: " + carroNumero + " carro(s)");
		System.out.println("A quantidade de pessoas é: " + pessoaNumero + " pessoa(s)");
		System.out.println("Cada uma das " + pessoaNumero + " pessoa(s) receberá " + divisao + " carro(s)");
		System.out.println(resto + " carro(s) vão sobrar.");
		*/
		// outra opçao
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao + " carros e sobrou " + resto);
	}
}
