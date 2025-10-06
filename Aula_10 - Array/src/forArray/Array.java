package forArray;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		String [] nomes = new String [6];
		
		Scanner ler = new Scanner(System.in);
		
		for (int i=0; i < nomes.length; i++) {
			
			System.out.println("Defina os elemntos: ");
			 nomes[i] = ler.nextLine();
			
		}
		

		
		System.out.println("-------------");
		
		for (int i=0; i < nomes.length; i++) {
			
			System.out.println(nomes[i]);
			
		}
		
		ler.close();
		
	}

}