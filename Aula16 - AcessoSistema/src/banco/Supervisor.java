package banco;

public class Supervisor extends Funcionario implements InterfaceSistema {

	Cadastro cadastro;
	Funcionario funcionario;
	
	public Supervisor (int registro, String cargo, double salario, Cadastro d) {
		
		super(registro, salario, cargo);
		this.cadastro = d;

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

		System.out.println((this.salario * 0.15));

		
	}
}
