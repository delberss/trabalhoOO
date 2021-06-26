package futebol;

public abstract class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public Pessoa setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public int getIdade() {
        return idade;
    }
    public Pessoa setIdade(int idade) {
        this.idade = idade;
        return this;
    }
}
