package futebol;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClubeTest {

    @Test
    void calculaMediaIdadeJogadores() {
        Jogador jogador1 = new JogadorAtacante();
        jogador1.setIdade(22);

        Jogador jogador2 = new JogadorAtacante();
        jogador2.setIdade(25);

        Jogador jogador3 = new JogadorAtacante();
        jogador3.setIdade(19);


        List<Jogador> listaJogadores = new ArrayList<Jogador>();
        listaJogadores.add(jogador1);
        listaJogadores.add(jogador2);
        listaJogadores.add(jogador3);

        assertEquals(22.0f, Clube.calculaMediaIdadeJogadores(listaJogadores));
    }

    @Test
    void calculaQuantidadeAtacantes() {
        Jogador jogador1 = new JogadorAtacante();
        jogador1.setPosicao("ATACANTE");

        Jogador jogador2 = new JogadorDefensor();
        jogador2.setPosicao("DEFENSOR");

        Jogador jogador3 = new JogadorAtacante();
        jogador3.setPosicao("ATACANTE");


        List<Jogador> listaJogadores = new ArrayList<Jogador>();
        listaJogadores.add(jogador1);
        listaJogadores.add(jogador2);
        listaJogadores.add(jogador3);

        assertEquals(2, Clube.calculaQuantidadeAtacantes(listaJogadores));
    }

    @Test
    void calculaQuantidadeDefensores() {
        Jogador jogador1 = new JogadorDefensor();
        jogador1.setPosicao("DEFENSOR");

        Jogador jogador2 = new JogadorDefensor();
        jogador2.setPosicao("DEFENSOR");

        Jogador jogador3 = new JogadorDefensor();
        jogador3.setPosicao("DEFENSOR");


        List<Jogador> listaJogadores = new ArrayList<Jogador>();
        listaJogadores.add(jogador1);
        listaJogadores.add(jogador2);
        listaJogadores.add(jogador3);

        assertEquals(3, Clube.calculaQuantidadeDefensores(listaJogadores));
    }
}