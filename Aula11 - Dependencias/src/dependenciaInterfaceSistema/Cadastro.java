package dependenciaInterfaceSistema;

abstract public class Cadastro {

	protected String nome;
	
	protected int senha;
	
	protected double salario;
	
	
	public Cadastro (String nome, int senha, double salario) {
		
		this.nome = nome;
		this.senha = senha;
		this.salario = salario;
		
	}
}
