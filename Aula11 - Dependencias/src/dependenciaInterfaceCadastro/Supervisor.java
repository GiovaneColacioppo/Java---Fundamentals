package dependenciaInterfaceCadastro;

public class Supervisor implements AcessoInterface{

	private String nome;
	
	private int senha;
	
	public Supervisor (String nome, int senha) {
		
		this.nome = nome;
		this.senha = senha;
		
	}
	
	@Override
	public void acesso (int senha) {
		
		if(this.senha==senha) {
			
			System.out.println("liberado");
			
		} else {
			
			System.out.println("bloqueado");
			
		}
		
	}
	
}
