package atividade;

abstract public class Cadastro {

	protected String nome, endereco;
	
	protected int cpf, telefone;
	
	
	
	
	public Cadastro (String nome,String endereco, int cpf, int telefone) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		
	}
}
