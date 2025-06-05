import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }

    @Override
    public boolean equals(Object obj) {
        // 1. Verifica se é a mesma instância
        if (this == obj) {
            return true;
        }
        // 2. Verifica se o objeto passado é nulo ou de classe diferente
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // 3. Converte o objeto para Pessoa
        Pessoa outraPessoa = (Pessoa) obj;
        // 4. Compara os atributos nome e idade
        return idade == outraPessoa.idade && Objects.equals(nome, outraPessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}