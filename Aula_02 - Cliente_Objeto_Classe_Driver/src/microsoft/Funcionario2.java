package microsoft;

public class Funcionario2 {

	private String nome;
	
	protected String cpf;
	
	public String telefone;
	
	public Funcionario2(String nome, String cpf, String telefone) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	
		System.out.println(nome +" - " + cpf + " - " + " - " + telefone);
		
	}
	
}
