package futebol;

public class JogadorDefensor extends Jogador{

    public float calcularSalarioJogador(){
        return this.gols * this.partidas * this.bonusJogo;
    }

    @Override
    public String getInfoJogador() {
        return this.getNome() + " - " + this.partidas + " J - Defensor";
    }

    @Override
    public String calculaRenovacaoContrato() {
        if (this.getIdade() > 30 ){
            return "REPROVADO";
        }
        else{
            if (this.getIdade() > 20 && this.partidas < 10){
                return "REPROVADO";
            }
            else{
                return "APROVADO";
            }
        }
    }
}
