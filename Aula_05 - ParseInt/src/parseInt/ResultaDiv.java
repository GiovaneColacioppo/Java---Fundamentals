package parseInt;

import javax.swing.JOptionPane;

public class ResultaDiv {

	public static void main(String[] args) {

	int continua = 0; 
	double resultado;
		
		do {
		
		JOptionPane.showMessageDialog(null, "Informe dois numeros para eles serem divididos", "Divisao", JOptionPane.QUESTION_MESSAGE);
		String numeroTexto1 = JOptionPane.showInputDialog(null, "Digite um numero", "Primeiro numero", JOptionPane.QUESTION_MESSAGE);
	    String numeroTexto2 = JOptionPane.showInputDialog(null, "Digite seu divisor", "Segundo numero", JOptionPane.QUESTION_MESSAGE);
		
	    int num = Integer.parseInt(numeroTexto1);
	    
	    int divisor = Integer.parseInt(numeroTexto2);
	    
	    if (divisor == 0){
	    	JOptionPane.showMessageDialog(null, "Numero inválido");
	    	
	    }

	    if (num > divisor){
	    	
	    	resultado = num / divisor;
	    	
	    	JOptionPane.showMessageDialog(null, num + " / " + divisor + " = " + resultado);
	    	
	    } else {
	    	
	    	resultado = divisor / num;

	    	JOptionPane.showMessageDialog(null, divisor + " / " + num + " = " + resultado);
	    	
	    }
	    
	    String continuaTexto = JOptionPane.showInputDialog(null, "Voce quer fazer outro cálculo? \n Digite 1 para sim e 2 para nao ",
	    		"Continuar?", JOptionPane.QUESTION_MESSAGE);
	    
	    continua = Integer.parseInt(continuaTexto);
		} while (continua !=2);
	    
	    
    	JOptionPane.showMessageDialog(null, "Obrigado! \n Volte sempre! ");

		
		
	}

}

//Crie um código que solicite dois números e dê o resultado da divisão entre eles