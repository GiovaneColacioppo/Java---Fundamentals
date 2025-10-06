package forArray;

import java.util.Scanner;

public class ArrayBidimensional {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.println("Digite o numero de linhas da matriz:");
        int linhas = scanner.nextInt();
        System.out.println("Digite o numero de colunas da matriz:");
        int colunas = scanner.nextInt();

        String[][] matriz = new String[linhas][colunas];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) { 
            for (int j = 0; j < colunas; j++) { 
                System.out.print("Notas [" + i + "][" + j + "]: ");
                matriz[i][j] = scannerS.nextLine();
            }
        }

        System.out.println("\nBoletim:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        

        scanner.close();
        scanner.close();
    }
	
}

