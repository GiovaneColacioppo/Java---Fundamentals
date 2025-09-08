package aula8;

import java.util.Scanner;

public class AprovadoSwitch {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite sua nota para ver sua situacao");
		
		//De 5 a 10 = 1
		//Acima de 3 e menor que 5 = 2
		//Menor ou igual a 3 = 3
		
		int nota = ler.nextInt();
		
		
		
		switch(nota) {
		case 1:
			System.out.println("Voce foi aprovado!");
			return;
		case 2:
			System.out.println("Voce deve ir ao conselho!");
			return;
		case 3:
			System.out.println("Voce foi reprovado!");
			return;
		default:
			break;
	}
		
		
		
	}

}

//Desenvolva uma estrutura de decisão utilizando a instrução switch para o critério de aprovação baseado na média do aluno. 
//Inserir comentário para instrução.

//De 5 a 10 – Aprovado; 
//Acima de 3 e menor que 5 – Conselho; 
//Menor ou igual a 3 – Reprovado.   

