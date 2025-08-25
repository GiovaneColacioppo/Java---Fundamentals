package atividade;

public class Funcionario {

	public String nome;
	
	public String cargo;
	
	public String folga;
	
	public Funcionario (String nome, String cargo, String folga) {
		
		this.cargo = cargo;
		
		this.nome = nome;
		
		this.folga = folga;
		
		System.out.println("Funcionario " + this.nome + " com o cargo de " + this.cargo + " e responsavel pelo setor esta de folga no " + this.folga);
		
	}

	
	
	
	
	
}
