package futebol;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorDefensorTest {

    JogadorDefensor jogadorDefensor;
    @BeforeEach
    void setUp(){
        jogadorDefensor = new JogadorDefensor();
    }


    @Test
    void calcularSalarioJogador() {
        jogadorDefensor.setPartidas(30).setGols(2);

        assertEquals(30000.0f, jogadorDefensor.calcularSalarioJogador());
    }

    @Test
    void getInfoJogador() {
        jogadorDefensor.setNome("Sérgio Ramos");
        jogadorDefensor.setPartidas(40).setGols(3);

        assertEquals("Sérgio Ramos - 40 J - Defensor", jogadorDefensor.getInfoJogador());
    }

    @Test
    void calculaAprovacaoContrato() {
        jogadorDefensor.setIdade(20);
        assertEquals("APROVADO", jogadorDefensor.calculaRenovacaoContrato());
    }

    @Test
    void calculaReprovacaoContrato() {
        jogadorDefensor.setIdade(31);

        assertEquals("REPROVADO", jogadorDefensor.calculaRenovacaoContrato());
    }

    @Test
    void calculaSegundaReprovacaoContrato() {
        jogadorDefensor.setIdade(21);
        jogadorDefensor.setPartidas(9);

        assertEquals("REPROVADO", jogadorDefensor.calculaRenovacaoContrato());
    }
}