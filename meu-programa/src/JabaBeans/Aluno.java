package JabaBeans;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int NewIdade) {
        if (NewIdade<0)
            throw new IllegalArgumentException("Idade não pode ser negativa");
        this.idade = idade;
    }
}

