package banco;

public class TesteConta {

	public static void main(String[] args) {

		

		Cliente cli01 = new Cliente("Giovane", "451.020.168-06", "(11)93218-5245");
		Cliente cli02 = new Cliente("Jurandir", "321.123.444-06", "(11)92318-5985");
		
		Conta cc1 = new Conta(cli01, 100, 1000, 1121, 110);
		
		Conta cc2 = new Conta(cli02, 111, 10, 7145, 710);

		String nome = cc1.cliente.getNomeCliente();
		
		System.out.println(nome);
		
		cc1.confirmaAcesso(100, 1000, 1121);
	}

}
