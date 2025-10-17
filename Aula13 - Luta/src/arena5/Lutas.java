package arena5;

import java.awt.Font;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Lutas {

public static void main(String[] args) {
	
	Font fonteMaior = new Font("Arial", Font.PLAIN, 20); // fonte Arial, tamanho 20
	
	UIManager.put("OptionPane.messageFont", fonteMaior);
    UIManager.put("OptionPane.buttonFont", fonteMaior);
		
		Arena arena = new Arena();
		Scanner ler = new Scanner(System.in);
		int jogar = 0;
		
		do {
			arena.lutar();
			int resposta = JOptionPane.showConfirmDialog(null, "Quer lutar novamente?", "Escolha", JOptionPane.YES_NO_OPTION);
			jogar = resposta;
			
			
			
		} while(jogar == 0);
		
		System.out.println("Ate a proxima");
		JOptionPane.showMessageDialog(null, "Ate a proxima. Esperamos voce em uma proxima batalha dos campeoes.");
	}

}
