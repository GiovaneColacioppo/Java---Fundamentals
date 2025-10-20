package atividade;

import java.util.Scanner;

public class AcessoSistema {

	Scanner ler = new Scanner(System.in);
	
	public void funcaoSistema (SenhaSistema s) {
		
		System.out.println("Insira sua senha");
		
		int senha = ler.nextInt();
		
		s.Sistema(senha);
		
	}
	
	
	
	
}
