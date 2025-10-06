package jogoDoNumeroSecreto;

import java.util.Random;
import java.util.Scanner;

public class Secreto1 {
	
	public static void main(String[] args) {

	Random rand = new Random();
	
	Scanner ler = new Scanner(System.in);
	
	
	
	int jogo = 1;
	
	do {
		int secreto = rand.nextInt(10) + 1;	
		
		System.out.println("Advinhe um numero de 1 a 10. \n Voce tem 10 chances!");
	
		for (int i = 0; i < 10; i++) {
			int numUsuario;
			
			System.out.println("Digite um numero:");
			numUsuario = ler.nextInt();
			 if(numUsuario == secreto) {
				 
				System.out.println("PARABENS! \n VOCE ACERTOU!!!!!!!");
	
				 break;
			 } else {
				 System.out.println("Voce errou! Tente de novo. \n");
				 System.out.println("Voce ja tentou " + (i + 1) + " vezes. \n");
			 }
		
		}
			
		System.out.println("Voce quer jogar de novo? \n Responda 1 para sim e 2 para nao.");
		jogo = ler.nextInt();
		
		if (jogo != 1 && jogo != 2){
			System.out.println("Numero foi inserido incorretamente. \n");
		}
	
	} while (jogo == 1);
	
	System.out.println("Obrigado por jogar!!! \n Encerrando programa.");
	}
	
	
	
	
}
