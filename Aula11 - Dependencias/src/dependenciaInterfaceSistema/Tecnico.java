package dependenciaInterfaceSistema;

public class Tecnico extends Cadastro implements AcessoInterface {
	
public Tecnico (String nome, int senha, double salario) {
		
		super(nome, senha, salario);
		
	}
	
	@Override
	public void bonificacao() {
	
	System.out.println(super.salario * 0.4);
	
	}

	public void acesso (int senha) {
		
		if(super.senha==senha) {
			
			System.out.println("liberado");
			
		} else {
			
			System.out.println("bloqueado");
			
		}
		
	}
	
}

