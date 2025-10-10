package dependenciaInterfaceCadastro;

public class Gerente extends Cadastro implements AcessoInterface{


	public Gerente (String nome, int senha) {
		
		super(nome, senha);
		
	}
	
	@Override
	public void acesso (int senha) {
		
		if(super.senha==senha) {
			
			System.out.println("liberado");
			
		} else {
			
			System.out.println("bloqueado");
			
		}
		
	}
	
}
