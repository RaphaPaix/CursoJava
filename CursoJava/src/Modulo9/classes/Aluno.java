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
	//objeto disciplina dentro do objeto aluno
	private Disciplina disciplina = new Disciplina();
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
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
	//get e set idade
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
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
	/*
	//metodo media de notas
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	*/
	//metodo que retorna a media
	public double getMediaNota() {
		return (disciplina.getNota1()+disciplina.getNota2()+disciplina.getNota3()+disciplina.getNota4())/4;
	}
	//metodo aprovado 1 (mais utilizado pela praticidade - a responsabilidade da String fica para a tela)
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media>=70) {
			return true;
		}else {
			return false;
		}
	}
	//metodo aprovado 2
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media>=70) {
			return "Aluno aprovado";
		}else {
			return "Aluno reprovado";
		}
	}
	//metodo toString
	
	//metodo equals e hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", disciplina=" + disciplina + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
