package dependenciaInterfaceCadastro;

abstract public class Cadastro {

	protected String nome;
	
	protected int senha;
	
	
	
	public Cadastro (String nome, int senha) {
		
		this.nome = nome;
		this.senha = senha;
		
	}
}
