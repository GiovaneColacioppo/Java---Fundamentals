package banco;

public class Operador extends Funcionario implements InterfaceSistema {

	Cadastro cadastro;
	
	
	
	
	public Operador (int registro, String cargo, double salario, Cadastro c) {
		
		super(registro, salario, cargo);
		this.cadastro = c;
		
		
	}
	
	@Override
	public void senha (int senha) {
		
		if (cadastro.senha == senha){
			
			System.out.println("Liberado");
			
		}else {
			
			System.out.println("Bloqueado");
			
		}
		
	}

	@Override
	public void bonificacao() {

		System.out.println((this.salario * 0.10));
		
	}
}
