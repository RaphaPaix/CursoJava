package Programas.Extras;

import javax.swing.JOptionPane;

public class CalculoMedia {
	public static void main(String[] args) {
		//recebendo as notas
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota: ");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota: ");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira nota: ");
		String nota4 = JOptionPane.showInputDialog("Digite a quarta nota: ");
		//trocando o tipo de dados
		double nota1d = Double.parseDouble(nota1);
		double nota2d = Double.parseDouble(nota2);
		double nota3d = Double.parseDouble(nota3);
		double nota4d = Double.parseDouble(nota4);
		//calculando a media
		double media = (nota1d + nota2d + nota3d + nota4d) / 4;
		//imprimindo na caixa de diálogo a média
		JOptionPane.showMessageDialog(null, "A média é: " + media);
		//calculando aprovaçao
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado.");
			}else{
				JOptionPane.showMessageDialog(null, "Aluno em recuperação.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado.");
		}
	}
}
