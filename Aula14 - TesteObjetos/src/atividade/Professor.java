package atividade;

public class Professor extends Cadastro implements SenhaSistema {

	protected int senhaSistema, senhaEscola;
	
	double salario;
	
	public Professor(String nome, String endereco, int cpf, int telefone,double salario ,int senhaSistema, int senhaEscola) {
		
		super(nome, endereco, cpf, telefone);
		
		this.salario = salario;
		
		this.senhaSistema = senhaSistema;
		
		this.senhaEscola = senhaEscola;
		
	}

	@Override
	public void Sistema(int senhaS) {

		if(this.senhaSistema == senhaS) {
			
			System.out.println("Acesso liberado");
			
		}else {
			
			System.out.println("Acesso negado");
			
		}
		
		
	}

}
