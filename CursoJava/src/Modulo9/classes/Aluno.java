package Modulo9.classes;

public class Aluno {
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	//padrao
	public Aluno() {
		
	}
	//1 parametro
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	//2 parametro
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
