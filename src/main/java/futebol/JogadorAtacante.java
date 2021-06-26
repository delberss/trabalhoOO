package futebol;

public class JogadorAtacante extends Jogador{

    @Override
    public float calcularSalarioJogador(){
        return this.partidas * this.gols * this.bonusGol;
    }

    @Override
    public String getInfoJogador(){
        return this.getNome() + " - " + this.partidas + " J " + this.gols + " G - Atacante";
    }

    @Override
    public String calculaRenovacaoContrato() {
        if (this.getIdade() < 20 ){
            return "APROVADO";
        }
        else{
            if (this.gols > 20){
                return "APROVADO";
            }
            else{
                return "REPROVADO";
            }
        }
    }
}
