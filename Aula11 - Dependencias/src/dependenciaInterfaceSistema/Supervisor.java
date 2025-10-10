package dependenciaInterfaceSistema;

public class Supervisor extends Cadastro implements AcessoInterface{

	
	public Supervisor (String nome, int senha, double salario) {
		
		super(nome, senha, salario);
		
	}
	
	
	@Override
	public void bonificacao() {
		
		System.out.println(super.salario * 0.4);
		
		}
	public void acesso (int senha) {
		
		if(this.senha==senha) {
			
			System.out.println("liberado");
			
		} else {
			
			System.out.println("bloqueado");
			
		}
		
	}
	
}
