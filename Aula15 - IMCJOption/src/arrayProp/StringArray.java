package arrayProp;

public class StringArray {

	public static void main(String[] args) {

		String nome = "ChatGPT";
		
		int tamanhoString = nome.length();
		
		System.out.println(tamanhoString);
		
		
		int[]numeros = {10, 20, 30, 40};
		
		int tamanhoArray = numeros.length;
		
		System.out.println(tamanhoArray);
		
		int[][]numerosM = {
				{1, 2, 3, 4 , 5},
				{10, 20, 30, 40, 50},
				{100, 200, 300, 400, 500},
				{1000, 2000, 3000, 4000, 5000},
				{10000, 20000, 30000, 40000, 50000},
				{100000, 200000, 300000, 400000, 500000, 5, 5, 5, 5, 5}
		
		};
		
		int tamanhoM = numerosM.length;
		System.out.println(tamanhoM);
		
				
		for (int i = 0; i < numerosM.length; i++) { 
		    for (int j = 0; j < numerosM[i].length; j++) { 
		        System.out.print(numerosM[i][j] + " ");
		    }
		    System.out.println(); 
		}
		
		
	}

}
