package AulaHeranca;

public class Cliente {
    private String nome;
    private String endereco;
    
    Cliente(String nome, String endereco){
        setEndereco(endereco);
        setNome(nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.getNome() +
        "\nEndereço: " + this.getEndereco() + "\n";
    }
}
