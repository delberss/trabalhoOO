package futebol;

public abstract class Jogador extends Pessoa{
    protected int partidas;
    protected int gols;
    protected float bonusGol = 1000.0f;
    protected float bonusJogo = 500.0f;
    protected int titulos;
    protected String posicao;


    public int getPartidas() {
        return partidas;
    }
    public Jogador setPartidas(int partidas) {
        this.partidas = partidas;
        return this;
    }

    public int getGols() {
        return gols;
    }
    public Jogador setGols(int gols) {
        this.gols = gols;
        return this;
    }

    public float getBonusGol() {
        return bonusGol;
    }
    public Jogador setBonusGol(float bonusGol) {
        this.bonusGol = bonusGol;
        return this;
    }

    public float getBonusJogo() {
        return bonusJogo;
    }
    public Jogador setBonusJogo(float bonusJogo) {
        this.bonusJogo = bonusJogo;
        return this;
    }

    public int getTitulos() {
        return titulos;
    }
    public Jogador setTitulos(int titulos) {
        this.titulos = titulos;
        return this;
    }

    public String getPosicao() {
        return posicao;
    }
    public Jogador setPosicao(String posicao) {
        this.posicao = posicao;
        return this;
    }

    public abstract float calcularSalarioJogador();
    public abstract String getInfoJogador();
    public abstract String calculaRenovacaoContrato();
}
