package modulo9parte2.aulas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import Constantes.StatusAluno;
//importando esta classe aluno e disciplina para diferenciar da outra
import modulo9parte2.classes.Aluno;
import modulo9parte2.classes.Disciplina;

public class AulaAtual {
	public static void main(String[] args) {
		//login e senha para acessar
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		if(login.equalsIgnoreCase("admin")&&senha.equalsIgnoreCase("admin")){
			//declarando um HASHMAP = � uma lista que dentro dela temos uma chave que identifica uma sequencia de valores
			//hashmap elimina a declara�ao das outras 3 listas
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			//lista de alunos
			List<Aluno> alunos= new ArrayList<Aluno>();
			/*
			//listas aprovados, reprovados e em recupera�ao
			List<Aluno> alunosAprovados= new ArrayList<Aluno>();
			List<Aluno> alunosReprovados= new ArrayList<Aluno>();
			List<Aluno> alunosRecuperacao= new ArrayList<Aluno>();
			*/
			//criando uma itera�ao do for para criar a lista
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
				//adicionando a lista de forma din�mica
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
				
				if(escolha == 0) { //op�ao SIM = 0
					int continuarRemover = 0;
					int posi�ao = 1;
					while(continuarRemover == 0){
						String disciplinaARemover = JOptionPane.showInputDialog("Qual disciplina (digite sua posi�ao)?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaARemover).intValue() - posi�ao); //menos 1 para ajustar a posi�ao
						posi�ao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
					}
				}
				alunos.add(aluno1);
			}
			//usando hashmap - inicializando
			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			//separando as listas
			for (Aluno aluno : alunos) {
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				}else 
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}else {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}
			}
			//imprimindo a lista dos aprovados
			System.out.println("---------------Lista dos Aprovados--------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println("Aluno: "+aluno.getNome()+" / Media: "+aluno.getMediaNota());
			}
			//imprimindo a lista dos reprovados
					System.out.println("---------------Lista dos Reprovados--------------");
					for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
						System.out.println("Aluno: "+aluno.getNome()+" / Media: "+aluno.getMediaNota());
					}
					//imprimindo a lista dos em recupera�ao
					System.out.println("---------------Lista dos em Recupera�ao--------------");
					for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
						System.out.println("Aluno: "+aluno.getNome()+" / Media: "+aluno.getMediaNota());
					}
			//percorrendo a lista por posi�oes
			/*
			for(int pos = 0;pos < alunos.size();pos++) {
				Aluno aluno = alunos.get(pos);
				System.out.println("Aluno: "+aluno.getNome());
				System.out.println("Media do aluno: "+aluno.getMediaNota());
				System.out.println("Resultado: "+aluno.getAlunoAprovado2());
				for (Disciplina disc : aluno.getDisciplinas()) {
					System.out.println("Materia: "+disc.getDisciplina()+"	Nota = "+disc.getNota());
				}
				System.out.println("------------------------");//diferenciar os objetos
			}
			*/
			//susbtituindo um aluno na lista
			/*
			int confirmarSubstituir = JOptionPane.showConfirmDialog(null, "Deseja substituir um aluno?");
			if(confirmarSubstituir == 0) {
				String nomeSubstituido = JOptionPane.showInputDialog("Digite o nome do aluno a ser substituido: ");
				for(int pos = 0;pos < alunos.size();pos++) {
					Aluno aluno = alunos.get(pos);
					if(aluno.getNome().equalsIgnoreCase(nomeSubstituido)) {
						Aluno trocar = new Aluno();
						String nomeSubstituto = JOptionPane.showInputDialog("Digite o nome do novo aluno:");
						trocar.setNome(nomeSubstituto);
						Disciplina disciplina = new Disciplina();
						String novaDisciplina = JOptionPane.showInputDialog("Adicione uma disciplina:");
						disciplina.setDisciplina(novaDisciplina);
						String novaNota = JOptionPane.showInputDialog("Qual a nota?");
						disciplina.setNota(Double.valueOf(novaNota));
						trocar.getDisciplinas().add(disciplina);
						alunos.set(pos, trocar);
						aluno = alunos.get(pos);
					}
					System.out.println("Aluno: "+aluno.getNome());
					System.out.println("Media do aluno: "+aluno.getMediaNota());
					System.out.println("Resultado: "+aluno.getAlunoAprovado2());
					for (Disciplina disc : aluno.getDisciplinas()) {
						System.out.println("Materia: "+disc.getDisciplina()+"	Nota = "+disc.getNota());
					}
					System.out.println("------------------------");//diferenciar os objetos
				}
			}
			*/
			//for para imprimir a lista de alunos
			/*
			for (Aluno aluno : alunos) {
				System.out.println(aluno.toString());
				System.out.println(aluno.getDisciplinas().toString());
				//pegando media e resultado do aluno
				System.out.println("A m�dia do aluno �: " + aluno.getMediaNota());;
				System.out.println("Resultado pelo m�todo 2: " + aluno.getAlunoAprovado2());
				//System.out.println("Resultado: " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
				System.out.println("------------------------------------------");
			}
			*/
			//for para imprimir um aluno espec�fico
			/*
			int confirmarEncontrar = JOptionPane.showConfirmDialog(null, "Deseja encontrar um aluno espec�fico?");
			if(confirmarEncontrar == 0) {
				String nomeEncontrar = JOptionPane.showInputDialog("Qual aluno quer encontrar?");
				for (Aluno aluno : alunos) {
					if(aluno.getNome().equalsIgnoreCase(nomeEncontrar)) {	
						System.out.println(aluno.toString());
						System.out.println(aluno.getDisciplinas().toString());
						//pegando media e resultado do aluno
						System.out.println("A m�dia do aluno �: " + aluno.getMediaNota());;
						System.out.println("Resultado pelo m�todo 2: " + aluno.getAlunoAprovado2());
						//System.out.println("Resultado: " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
						System.out.println("------------------------------------------");
						break; //evita comer processamento a mais
					}
				}
			}
			*/
			//for para remover um aluno espe�fico da lista
			/*
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
						System.out.println("A m�dia do aluno �: " + aluno.getMediaNota());;
						System.out.println("Resultado pelo m�todo 2: " + aluno.getAlunoAprovado2());
						//System.out.println("Resultado: " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
						System.out.println("------------------------------------------");
					}
				}
			}
			*/
			//imprimir disciplinas dos alunos que sobraram
			/*
			for (Aluno aluno : alunos) {
				System.out.println("Alunos que sobraram na lista: ");
				System.out.println(aluno.getNome());
				System.out.println("Suas mat�rias s�o: ");
				for (Disciplina disciplina : aluno.getDisciplinas()) {
					System.out.println(disciplina.getDisciplina());
				}
			}
			*/
		}else {
			JOptionPane.showMessageDialog(null, "Login recusado, tente novamente.");
		}
	}
}
