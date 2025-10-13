package coliseu;


import java.util.Scanner;

public class Arena {

    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);

        
        Guerreiro jogador = new Guerreiro("Heroi", 85, 85);

      
        Guerreiro[] adversarios = new Guerreiro[3];
        adversarios[0] = new Guerreiro("Devorador de mentes", 95, 40);
        adversarios[1] = new Guerreiro("Guardiao de ferro", 90, 50);
        adversarios[2] = new Guerreiro("Lobo terrivel", 70, 95);

        System.out.println("Bem-vindo a Arena! Voce enfrentara " + adversarios.length + " adversarios.");
        
       
        for (int i = 0; i < adversarios.length; i++) {
            Guerreiro inimigoAtual = adversarios[i];
            
            System.out.println("\n=== PROXIMO COMBATE: " + inimigoAtual.nome + " ===");
            System.out.println("Seus Atributos -> Forca: " + jogador.forca + " | Velocidade: " + jogador.velocidade);
            
        
            System.out.print("\nQual caracteristica voce quer usar? (Digite 'forca' ou 'velocidade'): ");
            String escolha = scanner.nextLine();
            
           
            Adversario batalha = new Adversario();
            boolean jogadorVenceu = batalha.iniciarBatalha(jogador, inimigoAtual, escolha);
            
           
            if (jogadorVenceu) {
                System.out.println("Voce derrotou " + inimigoAtual.nome + " e avanca para o proximo!");
            } else {
                System.out.println("\nVOCE FOI DERROTADO! Fim de jogo.");
                break; 
            }
        }
        
       
        System.out.println("\nO jogo terminou.");

      
        scanner.close();
    }
}