package arrayProp;

import java.lang.Math;
import javax.swing.JOptionPane;


public class IMC {

	public static void main(String[] args) {

		int confirma = 1;
		
		do {
			
			String Speso = JOptionPane.showInputDialog(null, "Ola, vamos calcular seu IMC!!!  \n\nDigite seu peso: ");
			
			int peso = Integer.parseInt(Speso);
			
			String Saltura = JOptionPane.showInputDialog(null, "Agora digite sua altura: ");
			
			double altura = Double.parseDouble(Saltura);
			
			
			double IMC = peso / Math.pow(altura, 2);
			
			String formatado = String.format("%.2f", IMC);
			
			
			
			JOptionPane.showInternalMessageDialog(null, "Seu peso: " + peso + " Sua altura: " + altura + "  Seu IMC: " + formatado );
			
			
			if (IMC < 18.5) {
				
				JOptionPane.showInternalMessageDialog(null, "Sua classificacao: MAGREZA");
				
			}
			else if (IMC > 18.5 && IMC <25){
	
				JOptionPane.showInternalMessageDialog(null, "Sua classificacao: NORMAL");
			}
			else if (IMC > 25.0 && IMC <30){
	
				JOptionPane.showInternalMessageDialog(null, "Sua classificacao: SOBREPESO");
			}
			else if (IMC > 30.0 && IMC <40){
	
				JOptionPane.showInternalMessageDialog(null, "Sua classificacao: OBESIDADE");
			}
			else {
	
				JOptionPane.showInternalMessageDialog(null, "Sua classificacao: OBESIDADE GRAVE");
			}
				
			confirma = JOptionPane.showConfirmDialog(null, "deseja continuar?");

			
		}while (confirma == JOptionPane.YES_OPTION);
	}

}
