package ContaBancaria;

public class TesteConta {

	public static void main(String[] args) {

		Conta cc1 = new Conta("100-0", "Ismael", 100.00, 123);
				
		Conta cc2 = new Conta("100-0", "Felipe Gouveia", 100.00, 2222);
			
		String conta = cc1.getAgencia();
		
		System.out.println(conta);
		
		System.out.println(cc2.getCliente() + " - " + cc2.getAgencia() + " - " + cc2.getNumeroConta());

		if(cc2.alterarSenha(2222, 321)) {
			System.out.println("Senha alterada com sucesso");
		}else {
			System.out.println("Senha invalida");
		}
		
		if(cc2.alterarSenha(2222, 123)) {
			System.out.println("Senha alterada com sucesso");
		}else {
			System.out.println("Senha invalida");
		}

		
		cc2.sacar(50.0, 321);

		cc2.sacar(10.0, 111);

		cc2.sacar(1000.0, 321);

		System.out.println("Saldo atual: R$" + cc2.getSaldo());
		
	}
	
	

	 
	
}
