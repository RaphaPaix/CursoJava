package Modulo8.Aulas;

import javax.swing.JOptionPane;

public class AulaAtual {
	//Aula 11 e 12
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
		//confirma�ao de dialogo 0-sim 1-nao 2-cancel
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
		//impress�o dos dados
		System.out.println("A quantidade de carros �: " + carroNumero + " carro(s)");
		System.out.println("A quantidade de pessoas �: " + pessoaNumero + " pessoa(s)");
		System.out.println("Cada uma das " + pessoaNumero + " pessoa(s) receber� " + divisao + " carro(s)");
		System.out.println(resto + " carro(s) v�o sobrar.");
		*/
		// outra op�ao
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao + " carros e sobrou " + resto);
	}
}
