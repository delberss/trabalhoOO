package futebol;

import java.util.List;

public class Clube {

    public static float calculaMediaIdadeJogadores(List<Jogador> jogadores){
        float somaIdade = 0.0f;
        for (Jogador jogador: jogadores){
            somaIdade += jogador.getIdade();
        }
        return somaIdade / jogadores.size();
    }

    public static int calculaQuantidadeAtacantes(List<Jogador> jogadores){
        int totalAtacantes = 0;
        for (Jogador jogador: jogadores){
            if (jogador.getPosicao().equals("ATACANTE")){
                totalAtacantes += 1;
            }
        }
        return totalAtacantes;
    }

    public static int calculaQuantidadeDefensores(List<Jogador> jogadores){
        int totalDefensores = 0;
        for (Jogador jogador: jogadores){
            if (jogador.getPosicao().equals("DEFENSOR")){
                totalDefensores += 1;
            }
        }
        return totalDefensores;
    }


}
