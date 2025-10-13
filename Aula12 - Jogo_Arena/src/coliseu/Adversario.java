package coliseu;

public class Adversario {

       public boolean iniciarBatalha(Guerreiro jogador, Guerreiro inimigo, String caracteristicaEscolhida) {

        System.out.println("------------------------");
        System.out.println("Luta: " + jogador.nome + " vs " + inimigo.nome);
        System.out.println("O jogador escolheu competir com: " + caracteristicaEscolhida.toUpperCase());

        boolean vitoriaDoJogador = false;

        if (caracteristicaEscolhida.equalsIgnoreCase("forca")) {
          
            System.out.println(jogador.nome + " (Forca: " + jogador.forca + ") vs " + inimigo.nome + " (Forca: " + inimigo.forca + ")");
            if (jogador.forca > inimigo.forca) {
                vitoriaDoJogador = true;
            }
        } else if (caracteristicaEscolhida.equalsIgnoreCase("velocidade")) {
          
            System.out.println(jogador.nome + " (Velocidade: " + jogador.velocidade + ") vs " + inimigo.nome + " (Velocidade: " + inimigo.velocidade + ")");
            if (jogador.velocidade > inimigo.velocidade) {
                vitoriaDoJogador = true;
            }
        } else {
            System.out.println("Escolha invalida! Você perdeu o turno.");
            return false; 
        }

        
        if (vitoriaDoJogador) {
            System.out.println("Resultado: Vitoria para " + jogador.nome + "!");
        } else {
            System.out.println("Resultado: " + inimigo.nome + " venceu a disputa!");
        }
        System.out.println("------------------------");

        return vitoriaDoJogador;
    }
}