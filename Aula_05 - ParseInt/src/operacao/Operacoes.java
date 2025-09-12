package operacao;

import javax.swing.JOptionPane;

public class Operacoes {

	public void permissaoHabilitacao() {

		int continua = 0;

		
		do {
			
			String nome = JOptionPane.showInputDialog(null, "Digite seu nome", "Informe o nome", JOptionPane.QUESTION_MESSAGE);
		    String numeroTexto = JOptionPane.showInputDialog(null, "Digite sua idade", "Informe sua idade", JOptionPane.QUESTION_MESSAGE);
			
		    int idade = Integer.parseInt(numeroTexto);

		    if (idade >= 18){
		    	
		    	JOptionPane.showMessageDialog(null, "Olá " + nome + ", voce tem " + idade + " anos e pode tirar sua carteira de motorista!");
		    	
		    } else {
		    	
		    	JOptionPane.showMessageDialog(null, "Olá " + nome + ", voce tem " + idade + " anos. Voce ainda não pode tirar sua carteira de motorista.");
		    	
		    }
		    
		    String continuaTexto = JOptionPane.showInputDialog(null, "Voce quer continuar? \n Digite 1 para sim e 2 para nao ", "Continuar?", JOptionPane.QUESTION_MESSAGE);
		    
		    continua = Integer.parseInt(continuaTexto);
			} while (continua !=2);
		
    	JOptionPane.showMessageDialog(null, "Obrigado! \n Volte sempre! ");
		
	}

}
