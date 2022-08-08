package modulo9parte2.aulas;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

//importando esta classe aluno e disciplina para diferenciar da outra
import modulo9parte2.classes.Aluno;
import modulo9parte2.classes.Disciplina;

public class AulaAtual {
	public static void main(String[] args) {
		//lista de alunos
		List<Aluno> alunos= new ArrayList<Aluno>();
		//criando uma iteraçao do for para criar a lista
		String quantidadeAlunos = JOptionPane.showInputDialog("Quantos alunos quer adicionar?");
		for(int qtd = 1;qtd <= Integer.valueOf(quantidadeAlunos); qtd++) {
			//instanciando objeto aluno
			Aluno aluno1 = new Aluno();
			//adicionando nome, idade e cpf do aluno
			String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+(qtd)+"?");
			String idade = JOptionPane.showInputDialog("Qual a idade do aluno? ");
			String cpf = JOptionPane.showInputDialog("Digete o CPF do aluno");
			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));
			aluno1.setNumeroCpf(cpf);
			/*
			//adicionando disciplinas
			Disciplina disciplina1 = new Disciplina();
			Disciplina disciplina2 = new Disciplina();
			Disciplina disciplina3 = new Disciplina();
			Disciplina disciplina4 = new Disciplina();
			//setando nome e nota das disciplinas
			disciplina1.setDisciplina("Mat");
			disciplina2.setDisciplina("Geo");
			disciplina3.setDisciplina("Port");
			disciplina4.setDisciplina("Hist");
			disciplina1.setNota(30);
			disciplina2.setNota(40);
			disciplina3.setNota(80);
			disciplina4.setNota(60);
			//adicionando a lista do aluno1
			aluno1.getDisciplinas().add(disciplina1);
			aluno1.getDisciplinas().add(disciplina2);
			aluno1.getDisciplinas().add(disciplina3);
			aluno1.getDisciplinas().add(disciplina4);
			*/
			//adicionando a lista de forma dinâmica
			//determinando o tamanho
			String tamanho = JOptionPane.showInputDialog("Quantas disciplinas quer adicionar?");
			for(int pos = 1; pos <= Integer.valueOf(tamanho); pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Qual o nome da disciplina "+pos+"?");
				String notaDisciplina = JOptionPane.showInputDialog("Qual a nota obtida?");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));
				
				aluno1.getDisciplinas().add(disciplina);
			}
			//removendo uma disciplina
			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
			if(escolha == 0) { //opçao SIM = 0
				int continuarRemover = 0;
				int posiçao = 1;
				while(continuarRemover == 0){
					String disciplinaARemover = JOptionPane.showInputDialog("Qual disciplina (digite sua posiçao)?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaARemover).intValue() - posiçao); //menos 1 para ajustar a posiçao
					posiçao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
				}
			}
			alunos.add(aluno1);
		}
		//for para imprimir a lista de alunos
		/*
		for (Aluno aluno : alunos) {
			System.out.println(aluno.toString());
			System.out.println(aluno.getDisciplinas().toString());
			//pegando media e resultado do aluno
			System.out.println("A média do aluno é: " + aluno.getMediaNota());;
			System.out.println("Resultado pelo método 2: " + aluno.getAlunoAprovado2());
			//System.out.println("Resultado: " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
			System.out.println("------------------------------------------");
		}
		*/
		//for para imprimir um aluno específico
		int confirmarEncontrar = JOptionPane.showConfirmDialog(null, "Deseja encontrar um aluno específico?");
		if(confirmarEncontrar == 0) {
			String nomeEncontrar = JOptionPane.showInputDialog("Qual aluno quer encontrar?");
			for (Aluno aluno : alunos) {
				if(aluno.getNome().equalsIgnoreCase(nomeEncontrar)) {	
					System.out.println(aluno.toString());
					System.out.println(aluno.getDisciplinas().toString());
					//pegando media e resultado do aluno
					System.out.println("A média do aluno é: " + aluno.getMediaNota());;
					System.out.println("Resultado pelo método 2: " + aluno.getAlunoAprovado2());
					//System.out.println("Resultado: " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
					System.out.println("------------------------------------------");
					break; //evita comer processamento a mais
				}
			}
		}
		//for para remover um aluno espeífico da lista
		int confirmarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover um aluno?");
		if(confirmarRemover == 0) {
			String nomeRemover = JOptionPane.showInputDialog("Qual o nome do aluno a ser removido?");
			for (Aluno aluno : alunos) {
				if(aluno.getNome().equalsIgnoreCase(nomeRemover)) {	
					alunos.remove(aluno);
					break; //evita comer processamento a mais
				}else {
					System.out.println(aluno.toString());
					System.out.println(aluno.getDisciplinas().toString());
					//pegando media e resultado do aluno
					System.out.println("A média do aluno é: " + aluno.getMediaNota());;
					System.out.println("Resultado pelo método 2: " + aluno.getAlunoAprovado2());
					//System.out.println("Resultado: " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
					System.out.println("------------------------------------------");
				}
			}
		}
		//imprimir disciplinas dos alunos que sobraram
		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista: ");
			System.out.println(aluno.getNome());
			System.out.println("Suas matérias são: ");
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}
	}
}
