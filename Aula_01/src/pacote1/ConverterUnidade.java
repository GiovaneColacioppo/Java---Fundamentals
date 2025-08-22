package pacote1;

import java.util.Scanner;

public class ConverterUnidade {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Scanner lerString = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		
		String nome = lerString.nextLine();
		
		System.out.println("Seu nome e: " + nome);

		System.out.println("Digite um valor numerico: ");
		
		int numero = ler.nextInt();
				
		System.out.println("O numero inserido foi: "+ numero);
				
		System.out.println("Digite seu sobrenome: ");
		
		String sobrenome = lerString.nextLine();
		
		System.out.println("Seu sobrenome e: " + sobrenome);
		
		ler.close();
		
		lerString.close();
		
	}

}
