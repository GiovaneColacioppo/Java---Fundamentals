package jogoDoNumeroSecreto;

import java.util.Random;
import java.util.Scanner;

public class Secreto1 {
	
	public static void main(String[] args) {

	Random rand = new Random();
	
	Scanner ler = new Scanner(System.in);
	
	int dificuldade;

	int jogo = 1;
	
	do {
		
		do {
			System.out.println("OLA!!! \nVOCE ESTA PRESENCIANDO O JOGO DO NUMERO SECRETO \n");
			
			System.out.println("Escolha o nivel de dificuldade da sua partida. \n");
			
			System.out.println("Digite 1 para Facil:\nDigite 2 para Intermediario:\nDigite 3 para Dificil:\n");
			
			dificuldade = ler.nextInt();
			
			if (dificuldade != 1 && dificuldade != 2 && dificuldade != 3){
				
				System.out.println("Numero foi inserido incorretamente. \nInicializando novamente.");
			}
		} while (dificuldade != 1 && dificuldade != 2 && dificuldade != 3);
		
		
		int tentativa = 0;

		switch (dificuldade) {
		case 1: {
		
			tentativa = 10;
			break;
		}
		case 2: {
			
			tentativa = 5;
			break;
		}
		case 3: {
			
			tentativa = 2;
			break;
		}
		}
		
		
		
			int secreto = rand.nextInt(10) + 1;	
			
			System.out.println("Advinhe um numero de 1 a 10. \n Voce tem " + tentativa + " chances!" );
		
			for (int i = 0; i < tentativa; i++) {
				int numUsuario;
				
	
				
				System.out.println("Digite um numero:");
				numUsuario = ler.nextInt();
				
				if (numUsuario > 0 && numUsuario <= 10) {
					if(numUsuario == secreto) {
						 if (i == 0) {
						System.out.println("PARABENS! \n VOCE ACERTOU!!!!!!! \nVoce acertou em apenas " + (i+1) + " tentativa");
						 } else {
							 System.out.println("PARABENS! \n VOCE ACERTOU!!!!!!! \nVoce acertou em apenas " + (i+1) + " tentativas");							 
						 }
						break;
					} else {
						 System.out.println("Voce errou! Tente de novo. \n");
						 System.out.println("Voce ja tentou " + (i + 1) + " vezes. \n");
					}
			
				} else {
					
					System.out.println("Seu numero e invalido! \n Por favor tente de novo.");
					i = i-1;
					
				}
			}	
			System.out.println("Voce quer jogar de novo? \n Responda 1 para sim e 2 para nao.");
			jogo = ler.nextInt();
			
			if (jogo != 1 && jogo != 2){
				System.out.println("Numero foi inserido incorretamente. \n");
			}
			
	} while (jogo == 1);
	
	System.out.println("Obrigado por jogar!!! \n Encerrando programa.");
	
	ler.close();
	}
}