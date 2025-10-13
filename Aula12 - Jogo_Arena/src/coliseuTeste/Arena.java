package coliseuTeste;

import java.util.Random;
import java.util.Scanner;

public class Arena {
	
	public boolean lutar(Guerreiro g, Adversario a) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int adversarioIndex = a.escolherAdversario();
        if (adversarioIndex == -1) {
            System.out.println("Não há mais adversários disponíveis. Torneio finalizado.");
            return false; // não tem adversário, termina torneio
        }

        System.out.println("Seu adversário é: " + a.adversarios.get(adversarioIndex));
        

        System.out.println("Escolha seu poder para lutar:");
        System.out.println("1 - Velocidade (" + g.velocidade + ")");
        System.out.println("2 - Força (" + g.forca + ")");
        int escolhaGuerreiro;
        while (true) {
            System.out.print("Digite 1 ou 2: ");
            escolhaGuerreiro = scanner.nextInt();
            if (escolhaGuerreiro == 1 || escolhaGuerreiro == 2) break;
            System.out.println("Opção inválida. Tente novamente.");
        }

        int poderGuerreiro = (escolhaGuerreiro == 1) ? g.velocidade : g.forca;
        int escolhaAdversario = random.nextInt(2);
        int poderAdversario = a.poder[adversarioIndex][escolhaAdversario];
        

        System.out.println("Você escolheu o poder: " + (escolhaGuerreiro == 1 ? "Velocidade" : "Força"));
        System.out.println("Seu poder tem valor: " + poderGuerreiro);

        if (poderGuerreiro > poderAdversario) {
        	System.out.println("---------------------------------------");
            System.out.println("Você venceu a batalha!");
            return true; // vitória
        } else if (poderGuerreiro < poderAdversario) {
        	System.out.println("---------------------------------------");
            System.out.println("Você perdeu a batalha.");
            return false; // derrota
        } else {
            System.out.println("Empate na batalha.");
            return true; // considere empate como "não perdeu" para seguir lutando
        }
    }
}
