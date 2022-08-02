package Modulo9.classes;

public class Aluno {
	//atributos do aluno
	private String nome;
	private int idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
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
	//SET
	//this. faz referencia ao atributo da classe
	public void setNome(String nome) {
		this.nome = nome;
	}
	//GET
	public String getNome() {
		return nome;
	}
}
