package dependenciaInterfaceSistema;

public class Gerente extends Cadastro implements AcessoInterface{


	public Gerente (String nome, int senha, double salario) {
		
		super(nome, senha, salario);
		
	}
	
	@Override
	public void bonificacao() {
		
	System.out.println(super.salario);
	
	}
	
	public void acesso (int senha) {
		
		if(super.senha==senha) {
			
			System.out.println("liberado");
			
		} else {
			
			System.out.println("bloqueado");
			
		}
		
	}
	
}
