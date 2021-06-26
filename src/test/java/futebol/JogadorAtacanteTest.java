package futebol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorAtacanteTest {

    JogadorAtacante jogadorAtacante;

    @BeforeEach
    void setUp(){
        jogadorAtacante = new JogadorAtacante();
    }

    @Test
    void calcularSalarioJogador() {
        jogadorAtacante.setPartidas(20).setGols(15);

        assertEquals(300000.0f, jogadorAtacante.calcularSalarioJogador());
    }

    @Test
    void getInfoJogador() {
        jogadorAtacante.setNome("Cristiano Ronaldo");
        jogadorAtacante.setPartidas(30).setGols(25);

        assertEquals("Cristiano Ronaldo - 30 J 25 G - Atacante", jogadorAtacante.getInfoJogador());
    }

    @Test
    void calculaAprovacaoContrato() {
        jogadorAtacante.setIdade(19);
        jogadorAtacante.setGols(20);
        assertEquals("APROVADO", jogadorAtacante.calculaRenovacaoContrato());
    }

    @Test
    void calculaSegundaAprovacaoContrato() {
        jogadorAtacante.setIdade(20);
        jogadorAtacante.setGols(21);

        assertEquals("APROVADO", jogadorAtacante.calculaRenovacaoContrato());
    }

    @Test
    void calculaSegundaReprovacaoContrato() {
        jogadorAtacante.setIdade(20);
        jogadorAtacante.setGols(20);

        assertEquals("REPROVADO", jogadorAtacante.calculaRenovacaoContrato());
    }
}