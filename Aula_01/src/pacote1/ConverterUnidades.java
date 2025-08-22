package pacote1;

public class ConverterUnidades {

	public static void main(String[] args) {

		double celsius = 30;
		
		//Fórmula de conversão de temperatura;
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.println("Temperatura em celsius: " + celsius + "ºC equivale a " + fahrenheit + "ºF");
		
	}

}
