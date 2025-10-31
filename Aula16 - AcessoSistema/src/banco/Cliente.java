package banco;

public class Cliente extends Cadastro implements InterfaceSistema {
	
	Cadastro cadastro;
		
	public Cliente(String nome, int cpf, int senha) {

		super(nome, cpf, senha);
	
	}

	public void senha (int senha) {
		
		
		if (this.senha == senha){
			
			System.out.println("Liberado");
			
		}else {
			
			System.out.println("Bloqueado");
			
		}
		
	}

	@Override
	public void bonificacao() {
		
	}

}
