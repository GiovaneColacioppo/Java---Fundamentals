package banco;

import java.util.Scanner;

public class AcessoSistema {

	public void acessoUtil (InterfaceSistema s) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite a senha");

		int senha = scanner.nextInt();
		
		s.senha(senha);
		
		
		
		
	}
	
}
