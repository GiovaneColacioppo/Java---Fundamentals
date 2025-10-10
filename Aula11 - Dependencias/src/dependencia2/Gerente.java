package dependencia2;

public class Gerente {

	private String nome;
	
	private int senha;
	
	public Gerente (String nome, int senha) {
		
		this.nome = nome;
		this.senha = senha;
		
	}
	
	public void acesso (int senha) {
		
		if(this.senha==senha) {
			
			System.out.println("liberado");
			
		} else {
			
			System.out.println("bloqueado");
			
		}
		
	}
	
}
