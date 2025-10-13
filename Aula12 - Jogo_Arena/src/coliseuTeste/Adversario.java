package coliseuTeste;

import java.util.ArrayList;
import java.util.Random;

public class Adversario {
protected ArrayList<String> adversarios = new ArrayList<>();
    
    String[] nomes = {"Condor", "Mamba Negra", "Falcão Sombrio", "Lobo da Tempestade",
            "Águia de Ferro", "Dragão Escarlate", "Corvo Fantasma", "Fera do Abismo",
            "Guerreiro Espectral", "Escorpião Mortal", "Águia de Guerra", "Mago das Chamas"}; 
    
    protected int[][] poder = {
        {60, 250}, {45, 310}, {62, 258}, {40, 312},
        {60, 598}, {41, 320}, {65, 295}, {49, 305},
        {52, 294}, {48, 307}, {63, 296}, {47, 315},
    };

    private ArrayList<Integer> usados = new ArrayList<>();
    private Random random = new Random();

    public Adversario() {
        for (String nome : nomes) {
            adversarios.add(nome);
        }
    }

    public int escolherAdversario() {
        if (usados.size() == adversarios.size()) {
            return -1;
        }
        int index;
        do {
            index = random.nextInt(adversarios.size());
            System.out.println("Verificar " + usados.contains(index));
        } while (usados.contains(index));
        usados.add(index);
        return index;
    }
}