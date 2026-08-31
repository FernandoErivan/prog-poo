package AulaHeranca;

public class ClientePF extends Cliente{
    private String cpf;

    public ClientePF(String nome, String endereco, String cpf){
        super(nome, endereco);
        setCpf(cpf);   
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.getNome() +
        "\nEndereço: " + this.getEndereco() +
        "\nCPF: " + this.getCpf() + "\n";
    }
}
