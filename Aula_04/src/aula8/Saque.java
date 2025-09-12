package aula8;

import java.util.Scanner;

public class Saque {

	public static void main(String[] args) {

	Scanner ler = new Scanner(System.in);

	int voltar = 0;
	
	do {
		System.out.println("O que voce deseja fazer? \nDigite 1 para saque. \nDigite 2 para deposito. \nDigite 3 para transferencia.");
		
		int operacao = ler.nextInt();
	
		
		switch(operacao) {
		case 1:
			System.out.println("Saque realizado!");
			System.out.println("Digite 0 para voltar ao menu principal e 4 para sair do programa");
			voltar = ler.nextInt();
			break;
		case 2:
			System.out.println("Deposito realizado!");
			System.out.println("Digite 0 para voltar ao menu principal e 4 para sair do programa");
			voltar = ler.nextInt();
			break;
		case 3:
			System.out.println("Transferencia realizada!");
			System.out.println("Digite 0 para voltar ao menu principal e 4 para sair do programa");
			voltar = ler.nextInt();
			break;
		}
	} while (voltar != 4);
		System.out.println("Obrigado! Volte sempre");
		
	}

}

//Crie um menu:

//Escolha a opção desejada:

//1 saque
	//Saque realizado
	//0 voltar ao menu principal
	//4 Sair do programa

//2 depósito
	//Depósito realizado
	//0 voltar ao menu principal
	//4 Sair do programa

//3 Transferência
	//Transferência realizada
	//0 voltar ao menu principal
	//4 Sair do programa

//4 Sair do programa

//fim
	//Obrigado! Volte sempre