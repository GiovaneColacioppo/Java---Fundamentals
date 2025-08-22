package pacote1;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Scanner lerString = new Scanner(System.in);	
		
		System.out.println("Digite seu nome: ");
		
		String nome = lerString.nextLine();
		
		
		System.out.println("Digite seu sobrenome: ");
		
		String sobrenome = lerString.nextLine();
		
		System.out.println("Digite seu CEP: ");
		
		int cep = ler.nextInt();
		
		System.out.println("Digite seu numero de telefone: ");
		
		int numero = ler.nextInt();
		
		ler.close();
		
		lerString.close();
		
		System.out.println("Nome: " + nome + " " + sobrenome + " " + "\nCEP (sem hifen): " + cep + " " + "\nContato (sem hifen):" + numero);
		
		
	}

}
