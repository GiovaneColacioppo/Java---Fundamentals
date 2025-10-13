package coliseuTeste;

import java.util.Scanner;

public class Luta {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do seu guerreiro: ");
        String nome = scanner.nextLine();
        Guerreiro guerreiro = new Guerreiro(nome);
        Adversario adversario = new Adversario();
        Arena arena = new Arena();

        boolean continuar = true;
        while (continuar) {
            boolean venceu = arena.lutar(guerreiro, adversario);

            if (!venceu) { // perdeu ou acabou adversários
                System.out.print("Deseja tentar novamente? (s/n): ");
                String resposta = scanner.nextLine().toLowerCase();
                if (!resposta.equals("s")) {
                    continuar = false;
                }
            }
            // Se venceu ou empatou, o loop continua automaticamente, sem perguntar.
        }

        System.out.println("Fim das batalhas. Obrigado por jogar!");
    }
}